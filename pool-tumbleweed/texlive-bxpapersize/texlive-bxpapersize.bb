SUMMARY = "Synchronize output paper size with layout paper size"
DESCRIPTION = "As is well known, in LaTeX processing layout paper size \
specified by document class options is not automatically \
applied to output paper size. This package enables LaTeX \
authors to synchronize both kinds of paper sizes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn63174"

RPM_NAME = "texlive-bxpapersize-2023.201.0.0.6svn63174-52.1.noarch.rpm"
RPM_HASH = "51ad896844805c1b970a2216f9b5a119e3b3ae6a3a050b63c10b13ceea3d7dbee185d58033cc24c2f050cf0fc4fcec2a3193b800dee6252c27cbb0b71396a189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxpapersize.sty \
texlive-bxpapersize"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifptex.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
tex-pxatbegshi.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

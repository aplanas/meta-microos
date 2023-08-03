SUMMARY = "Synchronize output paper size with layout paper size"
DESCRIPTION = "As is well known, in LaTeX processing layout paper size \
specified by document class options is not automatically \
applied to output paper size. This package enables LaTeX \
authors to synchronize both kinds of paper sizes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn63174"

RPM_NAME = "texlive-bxpapersize-2023.209.0.0.6svn63174-53.1.noarch.rpm"
RPM_HASH = "f852b68900efce8b8551ac3cb5dfdca6a85858569b7271272123effbf5ab6fb1e48902851ff01ceffdadf8133ffc071e0e43c7adc7b4e9db4c5892a9995745b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxpapersize.sty \
texlive-bxpapersize"

RDEPENDS:${PN} += "/usr/bin/sh \
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

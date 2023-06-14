SUMMARY = "Thai Language Typesetting in XeLaTeX"
DESCRIPTION = "This package allows you to input Thai characters directly to \
LaTeX documents and choose any (system wide) Thai fonts for \
typesetting in XeLaTeX. It also tries to appropriately justify \
paragraphs with no more external tools. Required packages are \
fontspec, ucharclasses, polyglossia, setspace, kvoptions, \
xstring, and xpatch."
LICENSE = "LPPL-1.0"

PV = "2023.201.2021.03.01svn58019"

RPM_NAME = "texlive-thaispec-2023.201.2021.03.01svn58019-54.1.noarch.rpm"
RPM_HASH = "17fbcd31ea194a921523be79be0d542a9f992c5d411ed31d7fea85a6e9ab660cb36ff45cd7e4b164e3f88550d4d44f11016178161efe479c6aeca0de1cf3e79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thaispec.sty \
texlive-thaispec"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-amsthm.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
tex-mathspec.sty \
tex-mathtools.sty \
tex-polyglossia.sty \
tex-setspace.sty \
tex-ucharclasses.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

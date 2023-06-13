SUMMARY = "Notations for typesetting the 'Principia Mathematica'"
DESCRIPTION = "This package supports typesetting the Peanese notation in \
Volume I of Whitehead and Russell's 1910 'Principia \
Mathematica'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn58927"

RPM_NAME = "texlive-principia-2023.201.1.3svn58927-52.1.noarch.rpm"
RPM_HASH = "d5ca72a352c86510c69bbd7c9206ac7ce4bb25f0991b074840e82c563d9034fc7e0faef0f79f7f6cda515b82eda6a6cdd623f8a9d9576aa1631f8a4724d5a107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(principia.sty) \
texlive-principia"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(graphicx.sty) \
tex(pifont.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

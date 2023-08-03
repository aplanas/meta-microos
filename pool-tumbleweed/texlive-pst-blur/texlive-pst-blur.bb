SUMMARY = "PSTricks package for 'blurred' shadows"
DESCRIPTION = "Pst-blur is a package built for use with PSTricks. It provides \
macros that apply blurring to the normal shadow function of \
PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-pst-blur-2023.209.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "9c538f911d627629d9f9331770d0a4d154140b09ad281a11f3b02f3584f988ceccad86c08159c0af4dcca3e0e043eee5b3fb9193ae921df041d30de62721752b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-blur.sty \
tex-pst-blur.tex \
texlive-pst-blur"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

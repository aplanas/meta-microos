SUMMARY = "Typeset captions sideways"
DESCRIPTION = "Defines environments called SCfigure and SCtable (analogous to \
figure and table) to typeset captions sideways. Options include \
outercaption, innercaption, leftcaption and rightcaption."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7asvn65618"

RPM_NAME = "texlive-sidecap-2023.201.1.7asvn65618-53.1.noarch.rpm"
RPM_HASH = "8b49396864e886289ed38268d7d84522c5be53a0edd291b2454c41cae4d9c781f1fb35a910651c0a61c2efab6b8a7c22ff4fd36fd9958a44f2d60dda7bf7409b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sidecap.sty \
texlive-sidecap"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-ragged2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Declare robust command, with \\newcommand checks"
DESCRIPTION = "The package merely provides a variation of \
\\DeclareRobustCommand, which checks for the existence of a \
command before declaring it robust."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-2023.209.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "0bdc68e3891c3efaf6b91081837a8a63b4e0d2d9ab0a70a2c7f8b55333fa8da5103f86e83929c2bd022df839f331cabe6e395f855280d17dde94e5b745dae271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-robustcommand.sty \
texlive-robustcommand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

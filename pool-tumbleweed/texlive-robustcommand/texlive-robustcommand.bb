SUMMARY = "Declare robust command, with \\newcommand checks"
DESCRIPTION = "The package merely provides a variation of \
\\DeclareRobustCommand, which checks for the existence of a \
command before declaring it robust."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-2023.209.0.0.1svn15878-54.2.noarch.rpm"
RPM_HASH = "1aec879ee27c38fd63108ea499c9c06eeddacc6324257eb3e46f771f9685a1a2f11bb975848345a06b71dba3ac0d51360c1dc0babc8cca5dee89331c03b461cd"
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

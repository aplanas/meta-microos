SUMMARY = "Declare robust command, with \\newcommand checks"
DESCRIPTION = "The package merely provides a variation of \
\\DeclareRobustCommand, which checks for the existence of a \
command before declaring it robust."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-2023.201.0.0.1svn15878-53.2.noarch.rpm"
RPM_HASH = "3d0fca090464296f8dcc6bb94164fb9df4f459738706400a56edc8d686cd969bc8826aa67cd32404da590892a4b7ab8b86893415373fbd7bd34a895020d5f1fd"
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

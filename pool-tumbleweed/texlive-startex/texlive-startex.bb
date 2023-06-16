SUMMARY = "An XML-inspired format for student use"
DESCRIPTION = "A TeX format designed to help students write short reports and \
essays. It provides the user with a suitable set of commands \
for such a task. It is also more robust than plain TeX and \
LaTeX."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.04svn35718"

RPM_NAME = "texlive-startex-2023.201.1.04svn35718-57.1.noarch.rpm"
RPM_HASH = "41ba91c23f03b20e6cfc48fbf0bfa5c8bc5fef281bdbe549d619804bf598b8b047b65d03008e100c65d79452b78f0b2c30b5393ef1b3bcafe2822dc582591c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-startex.tex \
texlive-startex"

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

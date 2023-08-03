SUMMARY = "Typeset Discourse Representation Structures (DRS)"
DESCRIPTION = "The package draws Discourse Representation Structures (DRSs). \
It can draw embedded DRSs, if-then conditions and \
quantificational 'duplex conditions' (with a properly scaled \
connecting diamond). Formatting parameters allow the user to \
control the appearance and placement of DRSs, and of DRS \
variables and conditions. The package is based on DRS macros in \
the covington package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn19232"

RPM_NAME = "texlive-drs-2023.209.1.1bsvn19232-53.1.noarch.rpm"
RPM_HASH = "eb6659d9db8fb21cc8d69cef82fc864b07eef0c1a47053e914f0251850d3fcfc5f8476c9ab97ba7f1d73b2cab182c3adabcf9d5106ffbc0f936b8bada0b64ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drs.sty \
texlive-drs"

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

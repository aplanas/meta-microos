SUMMARY = "Documentation for texlive-expressg"
DESCRIPTION = "This package includes the documentation for texlive-expressg"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn29349"

RPM_NAME = "texlive-expressg-doc-2023.201.1.5svn29349-52.1.noarch.rpm"
RPM_HASH = "cd75765f6b8658fa43b19424daa6d51a52620369950ad9d7ff9687d8d638ec31119522b3efddab2a2c45b0b3be0387aa1f6ac6232a966d0ede5fcdaf8a9f8939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expressg-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm

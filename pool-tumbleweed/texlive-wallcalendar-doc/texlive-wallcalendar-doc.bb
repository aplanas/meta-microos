SUMMARY = "Documentation for texlive-wallcalendar"
DESCRIPTION = "This package includes the documentation for texlive-wallcalendar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1svn45568"

RPM_NAME = "texlive-wallcalendar-doc-2023.201.1.3.1svn45568-53.1.noarch.rpm"
RPM_HASH = "0b69671ab019d75ffccc3b717a89cf27d000dbcfe70f42d5c742537ccdd32db944a55bd376e438b1d89a4fe9875e9bd689b9e429191e02d6c7fdc9a97236d575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wallcalendar-doc"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm

SUMMARY = "Crm Shell Cluster Scripts"
DESCRIPTION = "Cluster scripts for crmsh. The cluster scripts can be run \
directly from the crm command line, or used by user interfaces \
like hawk to implement configuration wizards."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230725.5d35bb6c"

RPM_NAME = "crmsh-scripts-4.5.0+20230725.5d35bb6c-1.1.noarch.rpm"
RPM_HASH = "ae38d3b3eb7be9130d7ae3924039707d3a910f4975d56c82acef54fdaf13c82770cf0089989d7e589dffe0e80dfbfda46e92267ce113e038ff5692f25ef2dfb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-scripts"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm

SUMMARY = "Crm Shell Cluster Scripts"
DESCRIPTION = "Cluster scripts for crmsh. The cluster scripts can be run \
directly from the crm command line, or used by user interfaces \
like hawk to implement configuration wizards."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230427.11d11104"

RPM_NAME = "crmsh-scripts-4.5.0+20230427.11d11104-1.1.noarch.rpm"
RPM_HASH = "82ae23b28d51b92fbb1de28b2de150f982bac7f3d8c229ca996b9394dcc05ab2e921339b8b8aa79202d77a4d97cc779a74e04b6262bae831da5cc5f9a2547e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-scripts"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm

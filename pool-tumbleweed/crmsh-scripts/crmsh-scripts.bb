SUMMARY = "Crm Shell Cluster Scripts"
DESCRIPTION = "Cluster scripts for crmsh. The cluster scripts can be run \
directly from the crm command line, or used by user interfaces \
like hawk to implement configuration wizards."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230809.ddb17a0b"

RPM_NAME = "crmsh-scripts-4.5.0+20230809.ddb17a0b-1.1.noarch.rpm"
RPM_HASH = "20d32ef0f1084dd428859e0a8ff48de3c45ba4480995318e14591b98c1c0fa69e127eacfc020dd9c9f45b4dc2260ad1864b47fcd889ab097f8e5f0fb726f0081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-scripts"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm

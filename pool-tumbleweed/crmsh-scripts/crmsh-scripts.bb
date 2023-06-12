SUMMARY = "Crm Shell Cluster Scripts"
DESCRIPTION = "Cluster scripts for crmsh. The cluster scripts can be run \
directly from the crm command line, or used by user interfaces \
like hawk to implement configuration wizards."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230517.b2cb988b"

RPM_NAME = "crmsh-scripts-4.5.0+20230517.b2cb988b-2.1.noarch.rpm"
RPM_HASH = "18a2636b1195e82e95b9482f221dfdd0d16a860f9de3881430888ceb6219e789d0e87ab6ace722249fc536dd335093a2647613cb00566513bba0d0283eb15578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-scripts"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm

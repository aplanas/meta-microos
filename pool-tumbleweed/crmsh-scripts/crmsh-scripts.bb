SUMMARY = "Crm Shell Cluster Scripts"
DESCRIPTION = "Cluster scripts for crmsh. The cluster scripts can be run \
directly from the crm command line, or used by user interfaces \
like hawk to implement configuration wizards."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230705.ea8c76ff"

RPM_NAME = "crmsh-scripts-4.5.0+20230705.ea8c76ff-1.1.noarch.rpm"
RPM_HASH = "20d2eb1f86c34a9eabb33367184de01a797733b84f12b4a00ad347406bbd793ee6af56adb3e28684509baa2acaae34eeffcef0231536eb411058943e2529d2c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-scripts"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm

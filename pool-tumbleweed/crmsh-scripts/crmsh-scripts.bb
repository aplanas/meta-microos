SUMMARY = "Crm Shell Cluster Scripts"
DESCRIPTION = "Cluster scripts for crmsh. The cluster scripts can be run \
directly from the crm command line, or used by user interfaces \
like hawk to implement configuration wizards."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0+20230705.ea8c76ff"

RPM_NAME = "crmsh-scripts-4.5.0+20230705.ea8c76ff-2.1.noarch.rpm"
RPM_HASH = "e2b41050523a84aaf9f55f809690b0fd18e8ba04b84262469b05ff0607bc67806c9d03aa4edbf61a13e704e9d14b0a52c67b2cdf5ba9b87de9d4f4d905d3950a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-scripts"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm

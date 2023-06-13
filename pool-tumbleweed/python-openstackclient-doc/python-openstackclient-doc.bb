SUMMARY = "Documentation for OpenStack Command-line Client"
DESCRIPTION = "python-openstackclient is a unified command-line client for the OpenStack APIs. \
It is a thin wrapper to the stock python-*client modules that implement the \
actual REST API client actions. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "5.6.0"

RPM_NAME = "python-openstackclient-doc-5.6.0-2.6.noarch.rpm"
RPM_HASH = "1c66f02aa79e3872a5a015d40b21b327d7ac9c2d3a2589221a26f61926be601a307962fd3082c46ae1181342a381f4ed8d0d6cd9afe03a2700e51933c2010ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-openstackclient-doc"

RDEPENDS:${PN} += ""

inherit rpm

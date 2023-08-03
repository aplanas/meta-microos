SUMMARY = "Documentation for OpenStack Command-line Client"
DESCRIPTION = "python-openstackclient is a unified command-line client for the OpenStack APIs. \
It is a thin wrapper to the stock python-*client modules that implement the \
actual REST API client actions. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "5.6.0"

RPM_NAME = "python-openstackclient-doc-5.6.0-2.7.noarch.rpm"
RPM_HASH = "1a2e8de151abc4cc7f068a4393762e29857857d69449d3b37cb308bd0ad311bf8a49d18126eb9dd650d94f7104b86ed08ecbdb3720ee00c6127768224cad4563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-openstackclient-doc"

RDEPENDS:${PN} += ""

inherit rpm

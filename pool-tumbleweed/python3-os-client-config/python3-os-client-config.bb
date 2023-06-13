SUMMARY = "OpenStack Client Configuration Library"
DESCRIPTION = "os-client-config is a library for collecting client configuration for \
using an OpenStack cloud in a consistent and comprehensive manner. \
It will find cloud config for as few as 1 cloud and as many as you want \
to put in a config file. It will read environment variables and config \
files, and it also contains some vendor specific default values so that \
you don't have to know extra info to use OpenStack. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python3-os-client-config-2.1.0-3.3.noarch.rpm"
RPM_HASH = "24e99b5a2f5577b39d3ee39e23d060647cff9b7e91c7a03f819fa2a1d8992d2053ebbb175a5ae41ca4eeddf59a2e0c156d5498a97c965aa6ed54da8cbac793ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-os-client-config \
python3.10dist(os-client-config) \
python3dist(os-client-config)"

RDEPENDS:${PN} += "python(abi) \
python3-PyYAML \
python3-appdirs \
python3-keystoneauth1 \
python3-requestsexceptions"

inherit rpm

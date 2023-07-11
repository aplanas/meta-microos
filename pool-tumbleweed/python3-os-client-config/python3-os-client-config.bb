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

RPM_NAME = "python3-os-client-config-2.1.0-3.4.noarch.rpm"
RPM_HASH = "1c4b78825455c7f0c331b25a4241d41452db9fa27bf30553167ce5706da184d9f8917a5c63dcbadbda48d9e2862784b94dfde1afb19fd03daea1370f9cf02bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-os-client-config \
python3.11dist-os-client-config \
python3dist-os-client-config"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML \
python3-appdirs \
python3-keystoneauth1 \
python3-requestsexceptions"

inherit rpm

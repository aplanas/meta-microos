SUMMARY = "Python library for consuming OpenStack sevice-types-authority data"
DESCRIPTION = "The OpenStack Service Types Authority contains information about official \
OpenStack services and their historical service-type aliases. \
The data is in JSON and the latest data should always be used. This simple \
library exists to allow for easy consumption of the data, along with a built-in \
version of the data to use in case network access is for some reason not \
possible and local caching of the fetched data. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "python3-os-service-types-1.7.0-4.4.noarch.rpm"
RPM_HASH = "23794d1b91091db4692363f140d0fc77edf218e3e29d2ecae0de1a6d3c40cab94bfbfee874685cda46bb56b1eab52c1b459335aa88b1650725ae433ab6fdd9f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-os-service-types \
python3.10dist-os-service-types \
python3dist-os-service-types"

RDEPENDS:${PN} += "python-abi \
python3-pbr"

inherit rpm

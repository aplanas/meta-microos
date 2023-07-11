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

RPM_NAME = "python3-os-service-types-1.7.0-4.5.noarch.rpm"
RPM_HASH = "7516d3e9257a5ae56868902835cef452f72731f50da6d2baa5e4d1d2f229b05accb4e384a8e4a993f4482cd295ccb1fec0f9137c31eeb2d7b32aabc94f15818c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-os-service-types \
python3.11dist-os-service-types \
python3dist-os-service-types"

RDEPENDS:${PN} += "python-abi \
python3-pbr"

inherit rpm

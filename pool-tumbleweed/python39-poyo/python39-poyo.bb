SUMMARY = "YAML Parser for Python"
DESCRIPTION = "A YAML Parser for Python. \
 \
Please note that Poyo supports only a chosen subset of the YAML format. \
 \
It can only read but not write and is not compatible with JSON. \
 \
Poyo does not allow deserialization of arbitrary Python objects. Supported \
types are str, bool, int, float, NoneType as well as dict and list values."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-poyo-0.5.0-2.3.noarch.rpm"
RPM_HASH = "403de439f89ed67f3c7d1a670365e64e47ccb350d832ab812512f7086f19c879a85b45219cbb3dc37088239dfe9d065ed907522f01c5bc74c910dc282558ea96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-poyo \
python39-poyo \
python3dist-poyo"

RDEPENDS:${PN} += "python-abi"

inherit rpm

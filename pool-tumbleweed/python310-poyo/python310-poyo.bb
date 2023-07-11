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

RPM_NAME = "python310-poyo-0.5.0-2.3.noarch.rpm"
RPM_HASH = "258d68a1d7a31746b9bf86825c79b62413c27d50241ecc7b77473c81d4adaa06240bd9b050ae012d0b016741fc77304a942e765f26d910a37ff3b1418d1b8dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-poyo \
python310-poyo \
python3dist-poyo"

RDEPENDS:${PN} += "python-abi"

inherit rpm

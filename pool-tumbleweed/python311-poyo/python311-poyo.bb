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

RPM_NAME = "python311-poyo-0.5.0-2.3.noarch.rpm"
RPM_HASH = "6f4facfcddb966983d935764449661331751a8788c38079d32573bed4716b79d3157b62da9830f6979d7d5b32254c4142dabed314387f3fdc627dd1848562f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poyo \
python3.11dist-poyo \
python311-poyo \
python3dist-poyo"

RDEPENDS:${PN} += "python-abi"

inherit rpm

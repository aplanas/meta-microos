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

RPM_NAME = "python39-poyo-0.5.0-2.1.noarch.rpm"
RPM_HASH = "873894f2a352a143351c48efec90e991d81efdd55d945893334053d9dfe5f3b89b2ba22b0a254d5097a0357b50eda29843400b02aa165076152069a193186ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(poyo) \
python39-poyo \
python3dist(poyo)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

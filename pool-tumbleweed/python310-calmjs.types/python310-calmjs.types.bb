SUMMARY = "Types for the calmjs framework"
DESCRIPTION = "A collection of types (mostly exception classes) for use with |calmjs|_."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-calmjs.types-1.0.1-1.14.noarch.rpm"
RPM_HASH = "40f0ee9538c546558ec890d6ead0972559084972f7c947f26c8a307e5ed873e3cc400633636c9c119c76391c66ce46abd6c23141c986197ac43f4c06c14a385e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calmjs.types \
python3.10dist(calmjs.types) \
python310-calmjs.types \
python3dist(calmjs.types)"

RDEPENDS:${PN} += "python(abi) \
python310-setuptools"

inherit rpm

SUMMARY = "Library for encoding variable length integer data"
DESCRIPTION = "varints are a common encoding for variable length integer data, \
used in libraries such as sqlite, protobuf, v8, and more."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-varint-1.0.2-1.13.noarch.rpm"
RPM_HASH = "5152cdf8d39af26cd7475293ce2c04aaed8a95110f8d619b6b49edd2bfbad5c3ff97bd8e7901f46e95e833f4d63aeecfbfa0e8440906522dc3d32829426d1089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-varint \
python39-varint \
python3dist-varint"

RDEPENDS:${PN} += "python-abi"

inherit rpm

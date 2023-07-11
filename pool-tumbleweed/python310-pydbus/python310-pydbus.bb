SUMMARY = "Pythonic DBus library"
DESCRIPTION = "A dbus library for Python."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "python310-pydbus-0.6.0-1.18.noarch.rpm"
RPM_HASH = "bb027df2ddfb6cd387655a17625d84c987ca8cd82e2be3b934697c944816b1214b00e95a9832067780939a05e07540c1930597baf46be8590e9970c0c224a1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydbus \
python310-pydbus \
python3dist-pydbus"

RDEPENDS:${PN} += "girepository-1-0 \
python-abi \
python310-gobject"

inherit rpm

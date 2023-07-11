SUMMARY = "The qtpy.tests module"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
This subpackage separately provides the qtpy.tests module \
in order to avoid stupid rpmlint errors."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-QtPy-test-2.3.0-2.3.noarch.rpm"
RPM_HASH = "f37be306455d67236aafbd7b12c0182922aaf7d0d81a5bb4a86f522a2c83c1953080a65c78ea5fb38cb62e10c8e764ac384ed074e2a963fa23f71ef894c8f688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-QtPy-test"

RDEPENDS:${PN} += "python-abi \
python39-QtPy"

inherit rpm

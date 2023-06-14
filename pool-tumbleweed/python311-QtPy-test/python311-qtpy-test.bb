SUMMARY = "The qtpy.tests module"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
This subpackage separately provides the qtpy.tests module \
in order to avoid stupid rpmlint errors."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-QtPy-test-2.3.0-1.4.noarch.rpm"
RPM_HASH = "8ef7b078b2c88715c8a7f8f47d4e07190596e0590409f5cde6e02f4d256d5a72171fbff04708667c853fa635058def4793002a4fc14422ef77b795eb2f6af815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-QtPy-test"

RDEPENDS:${PN} += "python-abi \
python311-QtPy"

inherit rpm

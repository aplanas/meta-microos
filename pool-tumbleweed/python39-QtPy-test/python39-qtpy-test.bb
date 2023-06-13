SUMMARY = "The qtpy.tests module"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
This subpackage separately provides the qtpy.tests module \
in order to avoid stupid rpmlint errors."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-QtPy-test-2.3.0-1.4.noarch.rpm"
RPM_HASH = "1385c3c65b6672f74a531fb7291345251e2e8d6a00b99d7793604d2442a40f7a58d9f62a704af3c50b9aa8e40bae4e08b5cd904af04535f585bb98faa188e628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-QtPy-test"

RDEPENDS:${PN} += "python(abi) \
python39-QtPy"

inherit rpm

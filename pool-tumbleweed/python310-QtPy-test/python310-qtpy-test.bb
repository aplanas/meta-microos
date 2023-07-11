SUMMARY = "The qtpy.tests module"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
This subpackage separately provides the qtpy.tests module \
in order to avoid stupid rpmlint errors."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-QtPy-test-2.3.0-2.3.noarch.rpm"
RPM_HASH = "53842d1976d5acc45c0b95e94dade5894c61dfca7d64d3f877cc239250781df95d7ece3559ab5ff523eabbe2aabcf9c9c6f3490260f72a79356d00d9dfb3035a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-QtPy-test"

RDEPENDS:${PN} += "python-abi \
python310-QtPy"

inherit rpm

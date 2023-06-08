SUMMARY = "CIMOM neutral provider registration utility"
DESCRIPTION = "A utility allowing CMPI provider packages to register with various \
CIMOM(s) present on the system."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "cmpi-provider-register-1.1.0-2.11.noarch.rpm"
RPM_HASH = "1f6f31c9cbd0ce193a43055f5f074bc5b11c6363dc57a2a6ae278de40e42af82946db3d1ee25ad83dfce81387d35967f9ab1b3ad7f21230ff5a8a1b938f3881a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmpi-provider-register"
RDEPENDS:${PN} += "/usr/bin/python3 cim-schema python3-pywbem"

inherit rpm

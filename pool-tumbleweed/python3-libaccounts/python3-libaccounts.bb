SUMMARY = "Python bindings for the Account management library"
DESCRIPTION = "This package contains the python bindings for the account \
management library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "python3-libaccounts-1.26-1.4.aarch64.rpm"
RPM_HASH = "f1d1b7e202e125648f5889de5843c782242c4223d013be0d76c8f90791f607f893e4c59ef5e29f41c0943a4ecc88cb4de1650874eebabd6cde5bd352eea4d66d"

RPROVIDES:${PN} += "python3-libaccounts"

RDEPENDS:${PN} += "python-abi \
typelib-GObject"

inherit rpm

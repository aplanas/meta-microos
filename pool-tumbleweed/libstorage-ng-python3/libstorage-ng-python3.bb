SUMMARY = "Python bindings for libstorage-ng"
DESCRIPTION = "This package contains Python bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.115"

RPM_NAME = "libstorage-ng-python3-4.5.115-1.1.aarch64.rpm"
RPM_HASH = "42a4d34b9deff83b886a452daad0c2cb2e513b13a3c0c1cfd5e57e42dd616eea0bfc5072b7966a8f1a57d79ab1199b571a6c1a46439b891b0209cdce1aa85c41"

RPROVIDES:${PN} += "libstorage-ng-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1 \
python-abi"

inherit rpm

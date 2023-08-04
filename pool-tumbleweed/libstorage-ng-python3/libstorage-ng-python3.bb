SUMMARY = "Python bindings for libstorage-ng"
DESCRIPTION = "This package contains Python bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.133"

RPM_NAME = "libstorage-ng-python3-4.5.133-1.1.aarch64.rpm"
RPM_HASH = "4547942db2ffcacf6a2a129a67105b928ed1810a3e3af3154cf84d7ebf21163c1a1ee652c96d7a18d8eb77db79b12e686786b51dfcf2e4dd241ca9118ef64186"

RPROVIDES:${PN} += "libstorage-ng-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1 \
python-abi"

inherit rpm

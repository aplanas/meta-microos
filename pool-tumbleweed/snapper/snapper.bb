SUMMARY = "Tool for filesystem snapshot management"
DESCRIPTION = "This package contains snapper, a tool for filesystem snapshot management."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "snapper-0.10.5-2.1.aarch64.rpm"
RPM_HASH = "86511fe1dcc0d0674580c535c4579af35f5d5349f6dcce7695cdfb24c0c249d81b7440ab2c20386d0cc8dbcff3f1fb6f959252b5b474c96775bc8916311e547c"

RPROVIDES:${PN} += "snapper"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libmount.so.1 \
libsnapper.so.7 \
libsnapper7 \
libstdc++.so.6 \
libtinfo.so.6 \
systemd"

inherit rpm

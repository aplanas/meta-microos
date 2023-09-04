SUMMARY = "Table library for libime"
DESCRIPTION = "This package provides table library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libIMETable0-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "3b0ed7ec3fd9a224e29c74068af734d5d5ce7c5c0542dcbd57e6c9934e2a6cc59faf6c9d30f162dc5351a15dd2b2ed27379001fe96abdaf4758079109de9ba66"

RPROVIDES:${PN} += "libIMETable.so.0 \
libIMETable0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libime-dicts \
libstdc++.so.6"

inherit rpm

SUMMARY = "Table library for libime"
DESCRIPTION = "This package provides table library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libIMETable0-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "7908d5b8bf9a7af07c618658389e265d74808dc8de421275b58ca26b1c05e0a1762fac18e46fdd5897c579e054f52f8d34fcca81d5172f4d82592ad3b597f00a"

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

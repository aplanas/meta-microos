SUMMARY = "Table library for libime"
DESCRIPTION = "This package provides table library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libIMETable0-1.0.17-1.3.aarch64.rpm"
RPM_HASH = "7f9ce5ebe5fcc0d27b1302d913bb71b8d57929f33687a7ff4453af256e4ad3be32bf12936d709d2d66ca7703e72b7dc8dd33de9e8e58f84f8de1a31918c74952"

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

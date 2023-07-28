SUMMARY = "Address translation library used primarily by libkdumpfile"
DESCRIPTION = "A library that provides an abstraction layer for translating addresses \
between address spaces (i.e. physical vs virtual). \
 \
This package contains the libaddrxlat library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libaddrxlat3-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "2552e97a0ee5bb50c2d5a0cc0a80a3e901ca57907b0fc9044c8a82de931a5cd3940e7a6bb68ef9a6937eefe4d15cd2a84e5721f5175580591220e0cfe3b954a9"

RPROVIDES:${PN} += "libaddrxlat.so.3 \
libaddrxlat3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

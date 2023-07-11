SUMMARY = "FRRouting zeromq library"
DESCRIPTION = "This library contains part of the zermomq implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrzmq0-8.4-4.2.aarch64.rpm"
RPM_HASH = "6411108f5eaa88859d851f9ede86a6f92ccdc337fd22dd10dbff87695d4e52c85a5aab4a80cd723d987b6f0c8de7dac92c22f260cbe5b165f3b5c993d3b82be9"

RPROVIDES:${PN} += "libfrrzmq.so.0 \
libfrrzmq0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libzmq.so.5"

inherit rpm

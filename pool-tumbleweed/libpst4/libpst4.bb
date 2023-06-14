SUMMARY = "A library for reading Personal Storage Table files"
DESCRIPTION = "libpst is a library that can decode the email messages stored in a \
.pst (Personal Storage Table) file as created by Outlook."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst4-0.6.76-1.3.aarch64.rpm"
RPM_HASH = "360e2f74f82b6a827f2310464922792d2269009d88b1502d193a6193e2c6f49abd0e6dde59e1c155956481adc8abc0449967bb2e6a464f74a414b0bf14a88f44"

RPROVIDES:${PN} += "libpst.so.4 \
libpst4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm

SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-go-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "f54af1c263b97093fa3ef5c7a3fd16bfb9d879ccedf4ec2be683515303bb093e1e61cebee6cef7b6fc0ec5c59ba47398510152a0ee89fb302749bbefd76224b8"

RPROVIDES:${PN} += "gcc7-go"

RDEPENDS:${PN} += "gcc7 \
libc.so.6 \
libgmp.so.10 \
libgo.so.11 \
libgo11 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm

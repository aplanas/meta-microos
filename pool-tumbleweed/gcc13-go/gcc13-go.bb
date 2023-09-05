SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-go-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "e610f45a94edcb59f22ab51f7455cae878bff7e954344d0e335429e0c74bab2900a68753a8dbbdbb1f19931fcb1f6ae978daa1c36198946e440fd7dd3d85af8c"

RPROVIDES:${PN} += "gcc13-go"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgo.so.22 \
libgo22 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm

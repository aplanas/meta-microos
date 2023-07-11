SUMMARY = "A Mixed Integer Linear Programming (MILP) Solver Library"
DESCRIPTION = "Mixed Integer Linear Programming (MILP) solver library lpsolve solves \
pure linear, (mixed) integer/binary, semi-continuous and special \
ordered sets (SOS) models."
LICENSE = "LGPL-2.0+"

PV = "5.5.2.0"

RPM_NAME = "liblpsolve55-0-5.5.2.0-10.29.aarch64.rpm"
RPM_HASH = "20cc2680c60b9caf978cc4e24e98b1504c48fd739f95514e89023df72e37abb1964563285acd723646da020fb4a6fbf13da5a91b0d73057a3bc5b9211cc849c2"

RPROVIDES:${PN} += "liblpsolve55 \
liblpsolve55-0 \
liblpsolve55.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

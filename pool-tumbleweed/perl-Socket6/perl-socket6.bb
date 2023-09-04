SUMMARY = "IPv6 related part of the C socket.h defines and structure manipulators"
DESCRIPTION = "This module provides glue routines to the various IPv6 functions. \
 \
If you use the Socket6 module, be sure to specify 'use Socket' as well as \
'use Socket6'."
LICENSE = "BSD-3-Clause"

PV = "0.29"

RPM_NAME = "perl-Socket6-0.29-1.19.aarch64.rpm"
RPM_HASH = "66ec002eb3f47906f9c0a59d20745d2e44f28f6d7fb95e61800e6488ad12b9264300c9d0eb94404c88bd0b8b6a1ebdd7ffbcdaf13cd32b1e4fa0f72f085ce4b2"

RPROVIDES:${PN} += "perl-Socket6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

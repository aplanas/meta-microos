SUMMARY = "IPv6 related part of the C socket.h defines and structure manipulators"
DESCRIPTION = "This module provides glue routines to the various IPv6 functions. \
 \
If you use the Socket6 module, be sure to specify 'use Socket' as well as \
'use Socket6'."
LICENSE = "BSD-3-Clause"

PV = "0.29"

RPM_NAME = "perl-Socket6-0.29-1.18.aarch64.rpm"
RPM_HASH = "14f4debde930ceff50f567a274dfcd166809fb81663fb432d60d56b9aa9cc406425f91c242d7d47b26ce8e10c4501a763cdafac48eba722a4cc54e19f17b29d8"

RPROVIDES:${PN} += "perl-Socket6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

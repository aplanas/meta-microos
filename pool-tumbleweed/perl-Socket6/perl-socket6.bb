SUMMARY = "IPv6 related part of the C socket.h defines and structure manipulators"
DESCRIPTION = "This module provides glue routines to the various IPv6 functions. \
 \
If you use the Socket6 module, be sure to specify 'use Socket' as well as \
'use Socket6'."
LICENSE = "BSD-3-Clause"

PV = "0.29"

RPM_NAME = "perl-Socket6-0.29-1.17.aarch64.rpm"
RPM_HASH = "c4e6a0f3821e09b7b12919eef10dcb361ff6c4e3a81fa94453508a3a268824c4216538174b6ce51705e39630e61f0422ca21d95fd49354b647d57077b7108c9b"

RPROVIDES:${PN} += "perl(Socket6) \
perl-Socket6 \
perl-Socket6(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

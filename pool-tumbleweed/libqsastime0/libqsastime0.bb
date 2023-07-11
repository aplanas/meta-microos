SUMMARY = "PLplot qsatime component"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's qsatime."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libqsastime0-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "e1f71ebb4b99237f384548f8f1d4ea60177cbd8ba3730f8287f9289ace6244d45426d0f90521666b907f95b6e4c03faae88e75a4826086eadb4d339db8800716"

RPROVIDES:${PN} += "libqsastime.so.0 \
libqsastime0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

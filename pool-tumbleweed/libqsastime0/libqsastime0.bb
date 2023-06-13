SUMMARY = "PLplot qsatime component"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's qsatime."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libqsastime0-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "10a7b071b1ee30a580a3fec915d9eb97adf441b715d03a4b155eb4bc3f4fb65dee849aa7ebb68f303bc6cf192ea700db2dbb918f60c3409586dd64cf0a83f87f"

RPROVIDES:${PN} += "libqsastime.so.0()(64bit) \
libqsastime0 \
libqsastime0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm

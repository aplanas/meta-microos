SUMMARY = "A Fortran-77 to C Translator"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20210928"

RPM_NAME = "libf2c0-20210928-1.3.aarch64.rpm"
RPM_HASH = "ddf5b9368fda0c1fa81217294389944b9ee6ecb2062b90a2a5cc9c9a9ee0900fddcbada216310e49cf1896a8010aa11daeb8980908b0e5a7dcb98031520c3fa8"

RPROVIDES:${PN} += "libf2c.so.0()(64bit) \
libf2c0 \
libf2c0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm

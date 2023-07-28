SUMMARY = "A Fortran-77 to C Translator"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20210928"

RPM_NAME = "libf2c0-20210928-2.1.aarch64.rpm"
RPM_HASH = "08f26f8965bf968719f55e862b01db9b44eee5189ce6463e47f9a6ae3f554a3fa77facaad57e99321b5c4c73f58a0876bda1c1ad06890be1a3426b4011364974"

RPROVIDES:${PN} += "libf2c.so.0 \
libf2c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

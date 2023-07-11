SUMMARY = "A Fortran-77 to C Translator"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20210928"

RPM_NAME = "libf2c0-20210928-1.4.aarch64.rpm"
RPM_HASH = "c7c793cd75e4fe52b4017c0770693e23eb9e950e1bb3e6fd7edec493fd68a2a35da3a697cb4043fa3f98a08ba290362f72a7996084bc0f0f65b49b9c94cf5021"

RPROVIDES:${PN} += "libf2c.so.0 \
libf2c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

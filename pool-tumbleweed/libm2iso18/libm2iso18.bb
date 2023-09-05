SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2iso18-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "1f021a38af6bbb4994d72da8a488240f684d95f6ec0988ccd3ec26fdc684140afc6c10e904832a09d96a29ce9398b6da27e1e31da6cc5550e78b1fab7b93eab8"

RPROVIDES:${PN} += "libm2iso.so.18 \
libm2iso18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm

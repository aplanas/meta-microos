SUMMARY = "A small embeddable Tcl interpreter"
DESCRIPTION = "Jim is an opensource small-footprint implementation of the Tcl programming language."
LICENSE = "BSD-2-Clause"

PV = "0.82"

RPM_NAME = "libjim0_82-0.82-1.1.aarch64.rpm"
RPM_HASH = "3567857f715e501fed717feb27f899fd5e07f4e03ffc6981424ffbeaaad4043b0a28fb0a8d289c79f77bcb629b79e7bdc667c3a7e992ee6c17650d615dcff66b"

RPROVIDES:${PN} += "libjim.so.0.82 \
libjim0-82"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm

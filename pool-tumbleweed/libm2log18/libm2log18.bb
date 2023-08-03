SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7597"

RPM_NAME = "libm2log18-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "c9ec1ebdff22daa8f0a5fb05754f35bcc448c617310601e5a0b3ffee36268fcbd89ec3c48139b7d014b31cd536af1aedf20376ef31fca8033ac0a59127322e50"

RPROVIDES:${PN} += "libm2log.so.18 \
libm2log18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm

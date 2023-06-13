SUMMARY = "Plugin for the PLAIN SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-plain-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "98fc3c10630f632192baf94e35d7343c725c3baff4c85d4ab5c20b6721f0d2f9be77595e20930d1a9860f7d64859250024173bf6e4a8a6724400b1ee91c71a8a"

RPROVIDES:${PN} += "cyrus-sasl-plain \
cyrus-sasl-plain(aarch-64) \
libplain.so.3()(64bit)"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

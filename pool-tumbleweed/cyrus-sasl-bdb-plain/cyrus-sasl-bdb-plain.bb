SUMMARY = "Plugin for the PLAIN SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-plain-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "bd852d9140aef533e0d9f7cd913d97237c67af13d733da9bff848f5590007e41d4dd15f5d61f481d80cc256deb0d6b8be496ce9a66e5be801fc75ebe4a63decd"

RPROVIDES:${PN} += "cyrus-sasl-bdb-plain \
libplain.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

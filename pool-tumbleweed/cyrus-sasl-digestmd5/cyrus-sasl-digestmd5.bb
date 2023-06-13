SUMMARY = "Plugin for the DIGESTMD5 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-digestmd5-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "5fc8402f9b3bee8fa5fefd29ea3153e01a04bdd9a022fa2ddba85f7f39434997cf13bfd340de6c7554999c956e82bc76984d23fb542d0a8fe3fdc0321455f0c1"

RPROVIDES:${PN} += "cyrus-sasl-digestmd5 \
cyrus-sasl-digestmd5(aarch-64) \
libdigestmd5.so.3()(64bit)"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit)"

inherit rpm

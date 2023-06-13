SUMMARY = "A RFC3261 compliant SIP User-Agent library"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.11+20110422"

RPM_NAME = "libsofia-sip-ua0-1.12.11+20110422-1.14.aarch64.rpm"
RPM_HASH = "845bcd18ddab8847e419e5cb4a3de23afde71b9571be35a86f5c85aa1ff58ec156141f8f0448b32a9c45d71ee4e3b7447da49f58df8e99814a12e650dee8a3e4"

RPROVIDES:${PN} += "libsofia-sip-ua.so.0()(64bit) \
libsofia-sip-ua0 \
libsofia-sip-ua0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit)"

inherit rpm

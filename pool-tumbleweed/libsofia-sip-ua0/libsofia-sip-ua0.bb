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

RPM_NAME = "libsofia-sip-ua0-1.12.11+20110422-1.15.aarch64.rpm"
RPM_HASH = "ad341eb0e7b1c1c1f95c64f04edef75d3d524c07f4b41c72a80033e651adcc2028e94f731fb5a1888e993520d3d399cd5487906e95525051b018172e5b0c581b"

RPROVIDES:${PN} += "libsofia-sip-ua.so.0 \
libsofia-sip-ua0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm

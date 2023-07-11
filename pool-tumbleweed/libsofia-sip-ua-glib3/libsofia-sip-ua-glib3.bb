SUMMARY = "A RFC3261 compliant SIP User-Agent library  (glib2 bindings)"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the glib2 bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.11+20110422"

RPM_NAME = "libsofia-sip-ua-glib3-1.12.11+20110422-1.15.aarch64.rpm"
RPM_HASH = "8b395921233a86c0c3a70836329a7369a129b2441679f833b2684eb4982293d1b2809374f978c7f0187c4fd98606aa5ff1fa0a90e8c9c924d22a2b9c0fc1057c"

RPROVIDES:${PN} += "libsofia-sip-ua-glib.so.3 \
libsofia-sip-ua-glib3 \
sofia-sip-glib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsofia-sip-ua.so.0"

inherit rpm

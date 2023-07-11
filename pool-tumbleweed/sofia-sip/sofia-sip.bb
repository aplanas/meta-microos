SUMMARY = "A RFC3261 compliant SIP User-Agent library"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the cli tools what ship with sofia-sip."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.11+20110422"

RPM_NAME = "sofia-sip-1.12.11+20110422-1.15.aarch64.rpm"
RPM_HASH = "c38493527396cc3d56422571bb505d1a6a9f537dce14cc0eb226b497d2cf18653984fa1f4cfae1a6d3d3aeda57e5bbc6bf26311cee207cd8bdcb8e4b59f4762a"

RPROVIDES:${PN} += "sofia-sip \
sofia-sip-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libsofia-sip-ua.so.0 \
libssl.so.3"

inherit rpm

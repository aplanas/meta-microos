SUMMARY = "Development files for sofia-sip"
DESCRIPTION = "Sofia-SIP is an open-source SIP  User-Agent library, compliant with the \
IETF RFC3261 specification. It can be used as a building block for SIP \
client software for uses such as VoIP, IM, and many other real-time and \
person-to-person communication services. The primary target platform \
for Sofia-SIP is GNU/Linux. Sofia-SIP is based on a SIP stack developed \
at the Nokia Research Center. \
 \
This package holds the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.11+20110422"

RPM_NAME = "sofia-sip-devel-1.12.11+20110422-1.15.aarch64.rpm"
RPM_HASH = "a9584cd90c62a3920a53c492412ef7a9f9c7b1ac7c17cbbd5a00d2129e5ed89b11a81ed95089a2fb1c55cbe7a4367a9010dc6865d232ba111cb324b020c7751c"

RPROVIDES:${PN} += "pkgconfig-sofia-sip-ua \
pkgconfig-sofia-sip-ua-glib \
sofia-sip-devel"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/pkg-config \
glib2-devel \
libsofia-sip-ua-glib3 \
libsofia-sip-ua0 \
openssl-devel \
pkgconfig-glib-2.0 \
pkgconfig-sofia-sip-ua"

inherit rpm

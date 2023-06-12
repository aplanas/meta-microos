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

RPM_NAME = "sofia-sip-devel-1.12.11+20110422-1.14.aarch64.rpm"
RPM_HASH = "822d4dae563b296556591cd8d5fc35bcd18873330aa10b79d94e8b9d0b78d9a2020a637ced1e895fad0fafed6bced1b94567ff8432caf56d1ff863aa23415bff"

RPROVIDES:${PN} += "pkgconfig(sofia-sip-ua) \
pkgconfig(sofia-sip-ua-glib) \
sofia-sip-devel \
sofia-sip-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/pkg-config \
glib2-devel \
libsofia-sip-ua-glib3 \
libsofia-sip-ua0 \
openssl-devel \
pkgconfig(glib-2.0) \
pkgconfig(sofia-sip-ua)"

inherit rpm

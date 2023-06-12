SUMMARY = "Glib Bindings for avahi, the D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "GLib support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-glib1-0.8-23.1.aarch64.rpm"
RPM_HASH = "7ffb9557721b2d47320ff2bd596e9bcf945123ff4c531aefe9f5734f91cadf22a100aedb634c0f7a8481647fb8ecf66f31d440f11b1af511560f7ab27c6c0d9a"

RPROVIDES:${PN} += "avahi-glib \
libavahi-glib.so.1()(64bit) \
libavahi-glib1 \
libavahi-glib1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-common.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm

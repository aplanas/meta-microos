SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-gobject0-0.8-23.1.aarch64.rpm"
RPM_HASH = "0f35b596761bf89bc835d43504be31435e12d17bfa9e9606d39d59426834f3f8ad57bf20cfe50d412c7c2856bf9bdf111cdf52cdcd3163ab67fba6169dd4786d"

RPROVIDES:${PN} += "libavahi-gobject.so.0 \
libavahi-gobject0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

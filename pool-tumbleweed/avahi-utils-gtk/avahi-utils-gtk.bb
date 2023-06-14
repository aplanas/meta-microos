SUMMARY = "GTK+ Utilities for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-utils-gtk-0.8-23.1.aarch64.rpm"
RPM_HASH = "c91460243a39c1c739935cc7815e9e841898a8d5bef36398eb77d6acc237fd7de7b9ae3e897026f62d4d81f7852b7431471984111c897fed9151b0f3d450090d"

RPROVIDES:${PN} += "avahi-glib2-utils-gtk \
avahi-utils-gtk"

RDEPENDS:${PN} += "/bin/sh \
avahi \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-core.so.7 \
libavahi-glib.so.1 \
libavahi-ui-gtk3.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm

SUMMARY = "GNOME Calculator Library GTK Interface"
DESCRIPTION = "This package contains a shared library for gnome-calculator."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "libgci-1-0_0_0-44.0-1.2.aarch64.rpm"
RPM_HASH = "15219143494568596fd438897a8a02d872408a3c1a6e59ec2f7a49a34568f783fc6d834ac27d438d8d755aaee2cfe021c849a8c5248b1e50b239ba605331144b"

RPROVIDES:${PN} += "libgci-1-0-0-0 \
libgci-1.so.0.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcalc-2.so.1.0.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm

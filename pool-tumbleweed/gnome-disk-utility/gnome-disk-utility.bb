SUMMARY = "Disks application for dealing with storage devices"
DESCRIPTION = "The gnome-disk-utility project provides the Disks application for \
dealing with storage devices."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-disk-utility-44.0-1.1.aarch64.rpm"
RPM_HASH = "9c1ce16b9e105b687f8eda963f64337fdc212ab0b0ba728031c805bc204b54dec7feb5d49e8991c173479b4e2b8d185971dff216a32de4b0672336aa00d745e4"

RPROVIDES:${PN} += "gnome-disk-utility"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libdvdread.so.8 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
liblzma.so.5 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpwquality.so.1 \
libsecret-1.so.0 \
libsystemd.so.0 \
libudisks2.so.0 \
udisks2"

inherit rpm

SUMMARY = "Disks application for dealing with storage devices"
DESCRIPTION = "The gnome-disk-utility project provides the Disks application for \
dealing with storage devices."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-disk-utility-44.0-2.1.aarch64.rpm"
RPM_HASH = "7eea8744e1c2c495daa96dba754a7d89cbe7d72692f8f53b3a82a2b388c75af1e817d177718d60582c05809923e142fd3c7e09699b1feed3325a8c7422680d45"

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

SUMMARY = "Install GStreamer codecs using PackageKit"
DESCRIPTION = "The PackageKit GStreamer plugin allows any Gstreamer application to install \
codecs from configured repositories using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-gstreamer-plugin-1.2.5-9.4.aarch64.rpm"
RPM_HASH = "c431d7bb9cf12018ae64c341666639f4e646e1efcac8a45a2d01bd4c3f6585a9cdfb328a109a89298393091892fd9a937bc3a9323e43edef70e4e0c45d5eaf25"

RPROVIDES:${PN} += "PackageKit-gstreamer-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpackagekit-glib2.so.18 \
update-alternatives"

inherit rpm

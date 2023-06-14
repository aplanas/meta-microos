SUMMARY = "Install GStreamer codecs using PackageKit"
DESCRIPTION = "The PackageKit GStreamer plugin allows any Gstreamer application to install \
codecs from configured repositories using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-gstreamer-plugin-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "37943b57cc3cefc5ef9e45658dbe844df42d6a955388d3e1c27d9fa55114ac91d7929228a1051076336f06eb7fbc61481cba0acb8325c9ac9403b523edc3be75"

RPROVIDES:${PN} += "PackageKit-gstreamer-plugin"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpackagekit-glib2.so.18 \
update-alternatives"

inherit rpm

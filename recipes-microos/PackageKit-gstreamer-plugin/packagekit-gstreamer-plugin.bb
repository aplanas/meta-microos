SUMMARY = "Install GStreamer codecs using PackageKit"
DESCRIPTION = "The PackageKit GStreamer plugin allows any Gstreamer application to install \
codecs from configured repositories using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-gstreamer-plugin-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "37943b57cc3cefc5ef9e45658dbe844df42d6a955388d3e1c27d9fa55114ac91d7929228a1051076336f06eb7fbc61481cba0acb8325c9ac9403b523edc3be75"

RPROVIDES:${PN} += "PackageKit-gstreamer-plugin \
PackageKit-gstreamer-plugin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libpackagekit-glib2.so.18()(64bit) \
update-alternatives"

inherit rpm

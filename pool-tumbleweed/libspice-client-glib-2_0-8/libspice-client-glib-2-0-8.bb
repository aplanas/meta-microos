SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "libspice-client-glib-2_0-8-0.42-2.1.aarch64.rpm"
RPM_HASH = "f15cd0e8077dfd28fbd78583f5cd5e40670afc5a6a764da4d62a561ea7ce40d83decf768dc55d112f6d83cc900601c8ba8bbf58ec04dfefba1ec2da66d55424e"

RPROVIDES:${PN} += "libspice-client-glib-2-0-8 \
libspice-client-glib-2.0.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcacard.so.0 \
libcrypto.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libjpeg.so.8 \
libjson-glib-1.0.so.0 \
liblz4.so.1 \
libm.so.6 \
libopus.so.0 \
libphodav-3.0.so.0 \
libpixman-1.so.0 \
libsasl2.so.3 \
libsoup-3.0.so.0 \
libspice-client-glib-helper \
libssl.so.3 \
libusb-1.0.so.0 \
libusbredirhost.so.1 \
libusbredirparser.so.1 \
libz.so.1"

inherit rpm

SUMMARY = "The main library for AppStream"
DESCRIPTION = "The main library for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.2"

RPM_NAME = "libappstream4-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "2ee14bde02d6a0f224508e8054a2286f6851ad8a96aded443bd83acbbe67c976bd8a174aa16f1845fae57561f1260b109b55f291f747bfdb88f9b47a52543440"

RPROVIDES:${PN} += "libappstream.so.4 \
libappstream4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0 \
libxml2.so.2 \
libxmlb.so.2 \
libyaml-0.so.2"

inherit rpm

SUMMARY = "The main library for AppStream"
DESCRIPTION = "The main library for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "libappstream4-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "3e0bacacb0dfb2fb6d297a8ba8fea2cf37be4c116a7e1cce0c4c973e24a4123bf679a7ba773e3a3b83b851219ea474606f5b5a76d522b4d81fbaaa55c00e1fdc"

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

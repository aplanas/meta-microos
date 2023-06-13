SUMMARY = "Library for resource discovery and announcement over SSDP"
DESCRIPTION = "gssdp offers a GObject-based API for handling resource discovery and \
announcement over SSDP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.2"

RPM_NAME = "libgssdp-1_6-0-1.6.2-2.1.aarch64.rpm"
RPM_HASH = "33f3371013beecfe1d7762c7ab8becb1b2a4f9ad1b1400fdab23c35fb0d9089064805ee9dc8a46f5c8131e537110ca6d3fa54807382eaf57197eacf9a9d7c4af"

RPROVIDES:${PN} += "libgssdp-1.6.so.0()(64bit) \
libgssdp-1_6-0 \
libgssdp-1_6-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit)"

inherit rpm

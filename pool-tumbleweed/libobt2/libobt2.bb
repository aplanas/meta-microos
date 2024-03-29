SUMMARY = "Openbox Toolkit Library"
DESCRIPTION = "This subpackage contains a utility function library used by Openbox \
to load and parse configuration and theme files of Openbox."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "libobt2-3.6.1-4.1.aarch64.rpm"
RPM_HASH = "56cfcc959fc6a6df28de999ddca6bb411e3ba10d84f9879cabf057b0b3fdc8661e1935d9c8dcee88fb0162dab7992319b8451c4f49013c9ea24b7578a6fac8e9"

RPROVIDES:${PN} += "libobt.so.2 \
libobt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libxml2.so.2"

inherit rpm

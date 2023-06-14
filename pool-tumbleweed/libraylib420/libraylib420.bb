SUMMARY = "C library for learning video game programming"
DESCRIPTION = "A C library for learning video game programming."
LICENSE = "Zlib"

PV = "4.5.0"

RPM_NAME = "libraylib420-4.5.0-1.1.aarch64.rpm"
RPM_HASH = "10b3cbc2db994b3d8bac9601de6448c3e31982bfe1146cc3712ba6e4d40d1db02ef8e8eb32df36e677a6e51ce094b1ad7da6f5d0390004d3a9ea69f8d6cb0ea3"

RPROVIDES:${PN} += "libraylib.so.420 \
libraylib420"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

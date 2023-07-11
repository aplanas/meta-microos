SUMMARY = "A library for /usr/bin/find-like functionality"
DESCRIPTION = "libfind allows to be used for adding find(1)-like command-line features \
to programs."
LICENSE = "CDDL-1.0"

PV = "1.8"

RPM_NAME = "libfind4_0-1.8-47.4.aarch64.rpm"
RPM_HASH = "65721514bc93b8af1a9f6bbc9f4e60643633975c069796181f4eec2d66b0ca2bb7ae7fc1189e6eefd36e9fb35fac40eab2f32ba35e65b54f1ae8937faf449fe6"

RPROVIDES:${PN} += "libfind.so.4.0 \
libfind4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm

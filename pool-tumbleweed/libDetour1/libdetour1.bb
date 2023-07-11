SUMMARY = "Detour Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the detour library part of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libDetour1-1.5.1+git20210305.c5cbd53-1.8.aarch64.rpm"
RPM_HASH = "e1ea4e5ad6f3cfa61fede8298d1aed0639200202c4a08cc8302d4afb46c5cacd08b96aeeee0775ec8ca46beeab10aecf86ac78f86d7bfa845df3184f6c3e00fd"

RPROVIDES:${PN} += "libDetour.so.1 \
libDetour1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Allegro DGA2 (Direct Graphics Access) plugin"
DESCRIPTION = "This package contains a DGA2 (Direct Graphics Access) driver for Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-dga2-plugin-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "d724bc9b2c26ee8cd684323d0a67ab422513eae6dfbfa7e4865068039f6b80e91b07b36c81ff97421ff5adba7c6ea8665a6096801fe4f329d2d08f416a2534cf"

RPROVIDES:${PN} += "allegro44-dga2-plugin"

RDEPENDS:${PN} += "allegro44 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86dga.so.1 \
liballeg.so.4.4 \
libc.so.6"

inherit rpm

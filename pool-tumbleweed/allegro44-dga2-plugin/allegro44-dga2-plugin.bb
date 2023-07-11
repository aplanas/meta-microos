SUMMARY = "Allegro DGA2 (Direct Graphics Access) plugin"
DESCRIPTION = "This package contains a DGA2 (Direct Graphics Access) driver for Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-dga2-plugin-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "2994d8492e53fa2b65720a9ed4e94f22905e6d96f1240074d7d874295895b311a17509961cf4ebb40d515f46f6f4a6a0252cba85e7b3b3923307c75149681722"

RPROVIDES:${PN} += "allegro44-dga2-plugin"

RDEPENDS:${PN} += "allegro44 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86dga.so.1 \
liballeg.so.4.4 \
libc.so.6"

inherit rpm

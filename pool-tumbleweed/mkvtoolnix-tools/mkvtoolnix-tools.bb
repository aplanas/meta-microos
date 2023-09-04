SUMMARY = "Additional command line tools for mkv files"
DESCRIPTION = "This package contains extra command line tools for mkv diagnostic."
LICENSE = "GPL-2.0-or-later"

PV = "79.0"

RPM_NAME = "mkvtoolnix-tools-79.0-1.1.aarch64.rpm"
RPM_HASH = "a3b61527c429f661efc450651ee5b6f3b9b59fda5f3b4e9ae42172d1fa77634487c813b5cc9edd62e9e4edf9cbff721513a0ae6df6b261dfed9b9f011684800c"

RPROVIDES:${PN} += "mkvtoolnix-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libebml.so.5 \
libfmt.so.9 \
libgcc-s.so.1 \
libgmp.so.10 \
libmatroska.so.7 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm

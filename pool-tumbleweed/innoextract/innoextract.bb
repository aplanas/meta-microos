SUMMARY = "A tool to extract Inno Setup installers under non-windows systems"
DESCRIPTION = "Inno Setup is a tool to create installers for Microsoft Windows \
applications. Inno Extracts allows to extract such installers under \
non-windows systems without running the actual installer using wine. Inno \
Extract currently supports installers created by Inno Setup 1.2.10 to \
5.4.3."
LICENSE = "Zlib"

PV = "1.9"

RPM_NAME = "innoextract-1.9-1.21.aarch64.rpm"
RPM_HASH = "5cd1622d938504a931ecadc4297c2761e42bbbfc264880de626c8a26aee592ae132d3e3ba69d082a3c07d4eee7212b1f462d4ef7451d45e0b77d56a92ad2d1b9"

RPROVIDES:${PN} += "innoextract"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

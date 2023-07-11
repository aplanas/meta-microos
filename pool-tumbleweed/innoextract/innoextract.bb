SUMMARY = "A tool to extract Inno Setup installers under non-windows systems"
DESCRIPTION = "Inno Setup is a tool to create installers for Microsoft Windows \
applications. Inno Extracts allows to extract such installers under \
non-windows systems without running the actual installer using wine. Inno \
Extract currently supports installers created by Inno Setup 1.2.10 to \
5.4.3."
LICENSE = "Zlib"

PV = "1.9"

RPM_NAME = "innoextract-1.9-1.22.aarch64.rpm"
RPM_HASH = "38a144489f1d3a655f16bb39c693dce2631d0bc83be93244c42621ccece487423cb0b3fbd66b6b9d52eebb2fab798465ce2ed084469017a1438cfa03acc3db39"

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

SUMMARY = "Additional command line tools for mkv files"
DESCRIPTION = "This package contains extra command line tools for mkv diagnostic."
LICENSE = "GPL-2.0-or-later"

PV = "78.0"

RPM_NAME = "mkvtoolnix-tools-78.0-1.1.aarch64.rpm"
RPM_HASH = "7005de8fa4776417402d3cfdc3f287688dde0d518d924472b31b378a17ffa416bc973f46069e4b8bea05a61ebcf90643538fc261c1aed115594ddc0a9808b2a1"

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

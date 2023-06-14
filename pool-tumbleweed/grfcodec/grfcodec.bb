SUMMARY = "A suite of programs to modify Transport Tycoon Deluxe's GRF files"
DESCRIPTION = "A suite of programs to modify Transport Tycoon Deluxe's GRF files. \
Contains GRFCodec for encoding and decoding the actual GRF files, \
GRFDiff and GRFMerge for making and applying patches for GRF files, \
GRFID for extracting the (unique) NewGRF identifier and NFORenum, \
a format correcter and linter for the NFO language. NFO and PCX \
or PNG files are encoded to form GRF files."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.6+39"

RPM_NAME = "grfcodec-6.0.6+39-1.9.aarch64.rpm"
RPM_HASH = "f9e3ad3014ff6a9c44d352a5450ac1672b24e46b081de5fe606e34951dca257a7042ebd07dbe97e6d307d2182c812f9f4d7e81b2e982d9ed2539b25b21088c65"

RPROVIDES:${PN} += "grfcodec \
nforenum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm

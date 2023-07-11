SUMMARY = "A suite of programs to modify Transport Tycoon Deluxe's GRF files"
DESCRIPTION = "A suite of programs to modify Transport Tycoon Deluxe's GRF files. \
Contains GRFCodec for encoding and decoding the actual GRF files, \
GRFDiff and GRFMerge for making and applying patches for GRF files, \
GRFID for extracting the (unique) NewGRF identifier and NFORenum, \
a format correcter and linter for the NFO language. NFO and PCX \
or PNG files are encoded to form GRF files."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.6+39"

RPM_NAME = "grfcodec-6.0.6+39-1.10.aarch64.rpm"
RPM_HASH = "8ecd207281007bc348f54a44363fd45059cd61c96e548658f0659d9968bf3489755e56dd3d17ebe485f959eb88971a33388bcc4b04c1e425ee19c3c57e3f3e19"

RPROVIDES:${PN} += "grfcodec \
nforenum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm

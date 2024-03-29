SUMMARY = "Tools to transform e-books into other formats"
DESCRIPTION = "Tools to transform e-books into other formats. \
Currently supported: XHTML, raw, text."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-tools-0.1.3-2.21.aarch64.rpm"
RPM_HASH = "23778be0278ec987386910a1a2a41d0110864cf34b3f1dcffb998d8dc84ea8824d377e9ee0661d57c5388ecd160ef2b5b8e8d16616cad037709b8d6747e1d038"

RPROVIDES:${PN} += "libe-book-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libe-book-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm

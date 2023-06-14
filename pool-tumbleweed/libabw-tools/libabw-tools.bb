SUMMARY = "Tools to work with documents in AbiWord file-format"
DESCRIPTION = "This package contains tools to work with documents in AbiWord file-format."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libabw-tools-0.1.3-1.18.aarch64.rpm"
RPM_HASH = "2bacd4785cc2581493a61bb16660469a70c1812ec21e1cd4a37fa67920fc651d6c04d0a8537ec3dbf7a4b534a09ae86ec8c93ce7dd7d67d1216d73b02d335993"

RPROVIDES:${PN} += "libabw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabw-0.1.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0"

inherit rpm

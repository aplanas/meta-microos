SUMMARY = "Tools to work with documents in AbiWord file-format"
DESCRIPTION = "This package contains tools to work with documents in AbiWord file-format."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libabw-tools-0.1.3-1.19.aarch64.rpm"
RPM_HASH = "706e1023f5810f951b7bce53694bfdcc409a272f39624a63fa900de5661377993df2748bb1b60233086ba3c09a70b7140acdd56c9036aa7915676d3675fe0109"

RPROVIDES:${PN} += "libabw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabw-0.1.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0"

inherit rpm

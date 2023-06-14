SUMMARY = "Tools to work with Adobe/Macromedia drawings"
DESCRIPTION = "This package contains tools to work with Adobe/Macromedia drawings."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-tools-0.1.2-2.18.aarch64.rpm"
RPM_HASH = "27b68a7dff58105edfcb5c7cb52f09e86b7485fac2e28d55dc678f86d9beb1cc9d35b45fbd6afbadc410a58f23c5a71ca005c6e8a842e585589c115072750195"

RPROVIDES:${PN} += "libfreehand-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreehand-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm

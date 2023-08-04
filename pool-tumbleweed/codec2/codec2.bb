SUMMARY = "Low bit rate speech codec"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "codec2-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "74783ec367cfa0b317682f350453c76cbe8519f9ca7bfc9403711caeda16b53137cbaf910b7caf000d10014949d5dd4bd1902c2b9ffeabfc7988f95c78a4cd21"

RPROVIDES:${PN} += "codec2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcodec2.so.1.2 \
libm.so.6"

inherit rpm

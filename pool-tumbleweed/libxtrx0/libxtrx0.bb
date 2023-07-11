SUMMARY = "High level XTRX API"
DESCRIPTION = "High level API for XTRX software defined radio frontends."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrx0-0.0.0+git.20201202-3.8.aarch64.rpm"
RPM_HASH = "61d3ff85ade16e77bfef9e4b9a84513c43c113416a39a11d5745b46b6e90a52e6ebeddbaefaded4ec520a84210ade5e1d80319ba0919052aa1f0c71e00a46cd1"

RPROVIDES:${PN} += "libxtrx.so.0 \
libxtrx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblms7compact.so.0 \
libxtrxdsp.so.0 \
libxtrxll.so.0"

inherit rpm

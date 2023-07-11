SUMMARY = "X BrlAPI helper"
DESCRIPTION = "The xbrlapi utility is a helper to have BrlAPI work on a X system."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "xbrlapi-6.5-3.1.aarch64.rpm"
RPM_HASH = "4d1b1250763094d87b72d883e68e36725b58bb3c38a4447433b6f4c5d17b0c575c1514e50aec223e817b7590e3de6de565bf681e7080dbc1f398479624b3b6ea"

RPROVIDES:${PN} += "xbrlapi"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXtst.so.6 \
libbrlapi.so.0.8 \
libc.so.6 \
libicuuc.so.73"

inherit rpm

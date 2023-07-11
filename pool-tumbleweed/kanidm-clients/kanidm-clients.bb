SUMMARY = "Client tools for interacting with Kanidm"
DESCRIPTION = "Client utilities for interactive with kanidm servers"
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-clients-1.1.0~alpha12~git0.bcdbb18-1.2.aarch64.rpm"
RPM_HASH = "b07619f8efb88677f8341dd7852f6879b957f915a4b801f4d6d1a1ea910d900a32ce32de4b9f871853cd2b52dbdba4e28869988b0d28afac811dff8951e1a58c"

RPROVIDES:${PN} += "kanidm-clients"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libudev.so.1 \
libz.so.1"

inherit rpm

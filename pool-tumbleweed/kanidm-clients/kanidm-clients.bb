SUMMARY = "Client tools for interacting with Kanidm"
DESCRIPTION = "Client utilities for interactive with kanidm servers"
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-clients-1.1.0~alpha12~git0.bcdbb18-1.1.aarch64.rpm"
RPM_HASH = "8c66a1dc51c0e3c54829ac75d3fb7607171f50c10e7cb7d5201ddd596b4126a9e80af2472c9a7ff8ea1db318cd455dfedbadb62d7ab2b0d14891e7fdf3b51636"

RPROVIDES:${PN} += "kanidm-clients"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libudev.so.1 \
libz.so.1"

inherit rpm

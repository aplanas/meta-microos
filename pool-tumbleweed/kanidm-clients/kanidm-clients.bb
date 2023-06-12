SUMMARY = "Client tools for interacting with Kanidm"
DESCRIPTION = "Client utilities for interactive with kanidm servers"
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-clients-1.1.0~alpha12~git0.bcdbb18-1.1.aarch64.rpm"
RPM_HASH = "8c66a1dc51c0e3c54829ac75d3fb7607171f50c10e7cb7d5201ddd596b4126a9e80af2472c9a7ff8ea1db318cd455dfedbadb62d7ab2b0d14891e7fdf3b51636"

RPROVIDES:${PN} += "kanidm-clients \
kanidm-clients(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libz.so.1()(64bit)"

inherit rpm

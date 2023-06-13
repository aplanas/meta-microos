SUMMARY = "Kanidm server and related tools"
DESCRIPTION = "Server for kanidm providing the main authentication and identity service"
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-server-1.1.0~alpha12~git0.bcdbb18-1.1.aarch64.rpm"
RPM_HASH = "3508475b7fb18c739d5f8b3d63f7f165dd25c58d2e067b0001059fbaad1797027bdb072d6013edb6a4eede9de40a69f5e74c84e3523b6631a27845f631bea569"

RPROVIDES:${PN} += "config(kanidm-server) \
kanidm-server \
kanidm-server(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
kanidm-clients \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm

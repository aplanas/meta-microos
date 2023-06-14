SUMMARY = "Kanidm server and related tools"
DESCRIPTION = "Server for kanidm providing the main authentication and identity service"
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-server-1.1.0~alpha12~git0.bcdbb18-1.1.aarch64.rpm"
RPM_HASH = "3508475b7fb18c739d5f8b3d63f7f165dd25c58d2e067b0001059fbaad1797027bdb072d6013edb6a4eede9de40a69f5e74c84e3523b6631a27845f631bea569"

RPROVIDES:${PN} += "config-kanidm-server \
kanidm-server"

RDEPENDS:${PN} += "/bin/sh \
kanidm-clients \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm

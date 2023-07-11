SUMMARY = "Kanidm server and related tools"
DESCRIPTION = "Server for kanidm providing the main authentication and identity service"
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-server-1.1.0~alpha12~git0.bcdbb18-1.2.aarch64.rpm"
RPM_HASH = "b74041b43a55ffa9bb0281f53763cff3250fc5b8dbd523b1ce2db35082e7cf7b1fb66baa08f7f66bde85111cc87801b1c773ae253af12dc6fce1b923c58ead1a"

RPROVIDES:${PN} += "config-kanidm-server \
kanidm-server"

RDEPENDS:${PN} += "/usr/bin/sh \
kanidm-clients \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm

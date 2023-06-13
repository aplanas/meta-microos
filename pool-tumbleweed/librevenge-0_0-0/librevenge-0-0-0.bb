SUMMARY = "A base library for writing document import filters"
DESCRIPTION = "librevenge is a base library for writing document import filters. It has \
interfaces for text documents, vector graphics, spreadsheets and \
presentations."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-0_0-0-0.0.5-1.3.aarch64.rpm"
RPM_HASH = "5cb4ced2881639e4dc218d710e0142807f5544eb8ef435f1f3768f44160e66a56c298421ccb76815c9f1e6158518ea5a2c2e8091a5a5b7acbd82e4bff125b518"

RPROVIDES:${PN} += "librevenge-0.0.so.0()(64bit) \
librevenge-0_0-0 \
librevenge-0_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

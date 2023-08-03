SUMMARY = "Linux Studio Plugins Development files"
DESCRIPTION = " \
Development files for Linux Studio Plugins"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.8"

RPM_NAME = "lsp-plugins-devel-1.2.8-1.1.aarch64.rpm"
RPM_HASH = "e72f3c3ca0327a500cd08ea96b24941af2f23a35fefea1e70640e30d2f5cf2b9dd298d6ecb9024b69919843e60ba24eb4d708baf10f345bd18df2121a010d033"

RPROVIDES:${PN} += "lsp-plugins-devel \
pkgconfig-lsp-r3d-glx-lib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lsp-plugins-common"

inherit rpm

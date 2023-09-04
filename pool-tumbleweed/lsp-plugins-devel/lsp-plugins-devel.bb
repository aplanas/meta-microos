SUMMARY = "Linux Studio Plugins Development files"
DESCRIPTION = " \
Development files for Linux Studio Plugins"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.10"

RPM_NAME = "lsp-plugins-devel-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "70cdf3cc7d59982dc7886ff1e21dc1b7b1f5aab3cb01f618623f58b059804ea614bedd725195c4482ea1f0369e7eaad2b6df233b5291fd37d080467368fff770"

RPROVIDES:${PN} += "lsp-plugins-devel \
pkgconfig-lsp-r3d-glx-lib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lsp-plugins-common"

inherit rpm

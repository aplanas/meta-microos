SUMMARY = "Linux Studio Plugins Development files"
DESCRIPTION = " \
Development files for Linux Studio Plugins"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lsp-plugins-devel-1.2.7-1.1.aarch64.rpm"
RPM_HASH = "869afc078bef2f8dd14a48e9e6b0f1a080fe2ffff0009be77c9a472895d830a9abade0287ad12d8f5195041dc6684404342ab2b6e39926c224c87569fe02d748"

RPROVIDES:${PN} += "lsp-plugins-devel \
lsp-plugins-devel(aarch-64) \
pkgconfig(lsp-r3d-glx-lib)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lsp-plugins-common"

inherit rpm

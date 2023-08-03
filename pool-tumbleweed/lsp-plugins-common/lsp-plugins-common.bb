SUMMARY = "Linux Studio Plugins (Common files)"
DESCRIPTION = "Common files for lsp-plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.8"

RPM_NAME = "lsp-plugins-common-1.2.8-1.1.aarch64.rpm"
RPM_HASH = "e73bd1e3dd16823a12930717a420e57fd6b0c2db230dbd65465f333d5548b1f50be571ddfc51b61d550156409b44d0ff4317632673ef4240b451db8231609fc4"

RPROVIDES:${PN} += "liblsp-r3d-glx-lib-1.0.12.so \
lsp-plugins-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm

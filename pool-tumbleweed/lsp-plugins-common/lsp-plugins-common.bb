SUMMARY = "Linux Studio Plugins (Common files)"
DESCRIPTION = "Common files for lsp-plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lsp-plugins-common-1.2.7-1.1.aarch64.rpm"
RPM_HASH = "a0d89736122b04be7ecbc35459ed945ea906779a86467fd42eeca2c15c8827ac7c6248a946e6c64ef7e563c5ab69fa0bef3062a908c75d3a44b778613e8245e7"

RPROVIDES:${PN} += "liblsp-r3d-glx-lib-1.0.11.so()(64bit) \
lsp-plugins-common \
lsp-plugins-common(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm

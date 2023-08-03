SUMMARY = "Linux Studio Plugins (LV2)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LV2 version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.8"

RPM_NAME = "lv2-lsp-plugins-1.2.8-1.1.aarch64.rpm"
RPM_HASH = "8769a3692981dbdbe0916e3011bef2b38f5cc7950a77409b719f939974db8c1a31fe1c52fc6e237106eec68d3718e4e3eeebe679908cca97f53657d09b1db446"

RPROVIDES:${PN} += "lv2-lsp-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
lsp-plugins-common"

inherit rpm

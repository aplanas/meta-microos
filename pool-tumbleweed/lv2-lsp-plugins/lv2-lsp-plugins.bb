SUMMARY = "Linux Studio Plugins (LV2)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LV2 version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lv2-lsp-plugins-1.2.7-1.2.aarch64.rpm"
RPM_HASH = "6aa70a6bec7f3c6494a075aae006d2d96cbbda15b52c968f6839f991e76ceb7f9eb48e8beb9ebad80528c362d7552164ad22f9b38e9c17bfa6b58895888fcf94"

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

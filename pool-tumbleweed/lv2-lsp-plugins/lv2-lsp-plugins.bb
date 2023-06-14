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

RPM_NAME = "lv2-lsp-plugins-1.2.7-1.1.aarch64.rpm"
RPM_HASH = "6c707ffffaba4773603323dcef336b3e767d46c0ce79437d5fc152c3005ddfc6bf9ef7c7c33b66ab802e40358ceb51c831712236d43e9af89ef3fc375e035d16"

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

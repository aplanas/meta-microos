SUMMARY = "Linux Studio Plugins (VST)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the VST version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.8"

RPM_NAME = "vst-lsp-plugins-1.2.8-1.1.aarch64.rpm"
RPM_HASH = "e7dd6cc5ab6c90b78659035295fdfc04e40f9285915fd7289cd510a7bca0276bb3f177a3aee1c258186c6385822f0e43b23caeed5e5c94c789ad03d029afc319"

RPROVIDES:${PN} += "vst-lsp-plugins"

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

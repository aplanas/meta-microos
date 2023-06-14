SUMMARY = "Linux Studio Plugins Project (Stand-alone)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lsp-plugins-1.2.7-1.1.aarch64.rpm"
RPM_HASH = "4c9855a840390327d5b482a2264eb41a03a5013d2b8881aaafc09dbd1b3f7c45c85412af3c4f696882855c0bae100fb913a6a14e6ab64921811080cc7684f8f0"

RPROVIDES:${PN} += "config-lsp-plugins \
liblsp-plugins-jack-1.2.7.so \
lsp-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
lsp-plugins-common"

inherit rpm

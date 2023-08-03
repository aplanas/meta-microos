SUMMARY = "Linux Studio Plugins Project (Stand-alone)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.8"

RPM_NAME = "lsp-plugins-1.2.8-1.1.aarch64.rpm"
RPM_HASH = "4f77fe4e5ce413e9099d5785a37c018926ab7b5b27f24fde00ff3d74fa194b4667569559d1e52c3cbffe636e7c9fdd1f995bebcff3fa93d48f808adf3a06dd8f"

RPROVIDES:${PN} += "config-lsp-plugins \
liblsp-plugins-jack-1.2.8.so \
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

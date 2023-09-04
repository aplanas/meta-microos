SUMMARY = "Linux Studio Plugins Project (Stand-alone)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.10"

RPM_NAME = "lsp-plugins-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "01cb3502cf05d6f17b6d8f187cdd23dd9ca678bcbc24108c5b6e8742fb531eea80e2347cdb1b230d530677e781a30141654b07a220850a516ec668327383c747"

RPROVIDES:${PN} += "config-lsp-plugins \
liblsp-plugins-jack-1.2.10.so \
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

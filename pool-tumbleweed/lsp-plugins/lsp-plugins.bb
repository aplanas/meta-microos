SUMMARY = "Linux Studio Plugins Project (Stand-alone)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lsp-plugins-1.2.7-1.2.aarch64.rpm"
RPM_HASH = "fb796861d3ffc823aba96aa05d1f54b44c29db6e77a730553cf3c0850e2502b837d4fed64230f5dec008467f58a6955562b3ce08c2f422f6f1178eed5bc5c913"

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

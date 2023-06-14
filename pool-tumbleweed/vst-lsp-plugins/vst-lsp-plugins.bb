SUMMARY = "Linux Studio Plugins (VST)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the VST version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "vst-lsp-plugins-1.2.7-1.1.aarch64.rpm"
RPM_HASH = "cbd1485e77139fc5a6ea0f51764f44d356c4ec5611445e14412169955f19294a813295ad45e6091297819484480b33ee212c75b92aae9c789b09e8c7b8837776"

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

SUMMARY = "Linux Studio Plugins (VST)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the VST version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.10"

RPM_NAME = "vst-lsp-plugins-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "475bd370d5657baa8df034f8b8cd12d4d15ed4084a0a4a1ac22fa2ff39cc99cfe917471fe2fc3ce573473628ba3cdd43fb085167f514e4187ac723ddb174d8b7"

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

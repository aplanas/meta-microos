SUMMARY = "Linux Studio Plugins (CLAP)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the CLAP version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "clap-lsp-plugins-1.2.7-1.1.aarch64.rpm"
RPM_HASH = "6ce3a29ad519b134a29e64b4bea8a8bda112542aef75301bc6438de2904a8e77bd6520b109a849288a70c7cb01c3f2f54feba82bb56636943806d2f5fd471e2e"

RPROVIDES:${PN} += "clap-lsp-plugins \
clap-lsp-plugins(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libm.so.6()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit) \
lsp-plugins-common"

inherit rpm

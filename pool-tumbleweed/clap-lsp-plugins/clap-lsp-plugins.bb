SUMMARY = "Linux Studio Plugins (CLAP)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the CLAP version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.10"

RPM_NAME = "clap-lsp-plugins-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "26d0604efce888474b3da04296233d121637f928386279532631a40118269ea8e665c546c6cf85d6f4a16a249eb9a90b56d6fe9786e084c8f3e1af8c58ad9a71"

RPROVIDES:${PN} += "clap-lsp-plugins"

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

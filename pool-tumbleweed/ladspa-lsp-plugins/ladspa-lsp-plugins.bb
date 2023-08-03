SUMMARY = "Linux Studio Plugins (LADSPA)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LADSPA version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.8"

RPM_NAME = "ladspa-lsp-plugins-1.2.8-1.1.aarch64.rpm"
RPM_HASH = "0ce4d4a0a48b390b04d342451989f30221ec6b7f04c2efd37b70237292c1c74c0888c70d0629bf5232d621ac58eb1448a988283961c9f6b0d8ec1f652527890f"

RPROVIDES:${PN} += "ladspa-lsp-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
lsp-plugins-common"

inherit rpm

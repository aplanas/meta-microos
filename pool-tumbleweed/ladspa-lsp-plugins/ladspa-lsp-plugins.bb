SUMMARY = "Linux Studio Plugins (LADSPA)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LADSPA version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.10"

RPM_NAME = "ladspa-lsp-plugins-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "88bf45d79a465baa3381030856bcecb1d36ebf9b70ea89f960e9e50c24fa5e4ebefa77840bfed76223c99ada22447c46788faad5ea8e5338f67ef5c89c2b642e"

RPROVIDES:${PN} += "ladspa-lsp-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
lsp-plugins-common"

inherit rpm

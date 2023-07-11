SUMMARY = "Linux Studio Plugins (LADSPA)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LADSPA version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "ladspa-lsp-plugins-1.2.7-1.2.aarch64.rpm"
RPM_HASH = "8164343ee700e85e87f09d57519c8bb93a94568ea17e1180a1e8d4a0ee9ae1f4b9e311f96cc5458df9acb2060ab13039fd2ae3d4815cf5ec2d4f3248d61f2115"

RPROVIDES:${PN} += "ladspa-lsp-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
lsp-plugins-common"

inherit rpm

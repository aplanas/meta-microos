SUMMARY = "Linux Studio Plugins (CLAP)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the CLAP version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.8"

RPM_NAME = "clap-lsp-plugins-1.2.8-1.1.aarch64.rpm"
RPM_HASH = "ffd0574a0067c814f685434c9eadfbb6c1e6efe5577299278e82c9f949263fc2ba05129afc83ddeecc30412f1f9a2d35f07e358d49589d91f449e8b56a455528"

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

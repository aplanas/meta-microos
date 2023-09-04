SUMMARY = "Linux Studio Plugins (LV2)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LV2 version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.10"

RPM_NAME = "lv2-lsp-plugins-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "6f8bd7cb2c2fba4855487421849568a28a2da8aca01ad5b2f11d41f14197a598dde3172917531ffa6640a9ee7b875a65c2776eeff093256a30c4d046a97f1089"

RPROVIDES:${PN} += "lv2-lsp-plugins"

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

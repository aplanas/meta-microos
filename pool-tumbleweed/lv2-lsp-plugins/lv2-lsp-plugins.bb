SUMMARY = "Linux Studio Plugins (LV2)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LV2 version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lv2-lsp-plugins-1.2.7-1.1.aarch64.rpm"
RPM_HASH = "6c707ffffaba4773603323dcef336b3e767d46c0ce79437d5fc152c3005ddfc6bf9ef7c7c33b66ab802e40358ceb51c831712236d43e9af89ef3fc375e035d16"

RPROVIDES:${PN} += "lv2-lsp-plugins \
lv2-lsp-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
lsp-plugins-common"

inherit rpm

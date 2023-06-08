SUMMARY = "Linux Studio Plugins (CLAP)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the CLAP version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.6"

RPM_NAME = "clap-lsp-plugins-1.2.6-2.1.aarch64.rpm"
RPM_HASH = "aafd4b64e9fd7c98f731fb9e485cff879906fcff1406c9c9cffb9b907dd878f9634c9eab6bf7a5f5c6d121010ffdffb6bb85e4e4063cc057524be8398a666ce3"

RPROVIDES:${PN} += "clap-lsp-plugins clap-lsp-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfreetype.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) lsp-plugins-common"

inherit rpm

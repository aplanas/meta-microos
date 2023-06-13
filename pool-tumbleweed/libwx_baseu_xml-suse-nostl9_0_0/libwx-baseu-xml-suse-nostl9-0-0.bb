SUMMARY = "wxWidgets XML parser library"
DESCRIPTION = "This library contains classes for parsing XML documents."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu_xml-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "6e790e218631e2f14366f7ff8a8cc83f0e8dc89291e155eb211fceff7187c550cec7131ab90c9f5042c118448378994bd65d90bad64bfbf1e2050b5a221827d5"

RPROVIDES:${PN} += "libwx_baseu_xml-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu_xml-suse-nostl9_0_0 \
libwx_baseu_xml-suse-nostl9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse-nostl.so.9.0.0()(64bit)"

inherit rpm

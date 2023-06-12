SUMMARY = "Development files for the Nextcloud synchronisation library"
DESCRIPTION = "Development files for the Nextcloud Desktop Client synchronisation \
library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "libnextcloudsync-devel-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "99212d94917f9a128a1a382bef471f1201bc7f762d5ddb0ab0ee7ee2aa2ecba06b5ff0d7b3828521ff9933fa05fe67f662710285a8910ca9a3814975db025ecb"

RPROVIDES:${PN} += "libnextcloudsync-devel \
libnextcloudsync-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libnextcloud_csync.so.0()(64bit) \
libnextcloudsync.so.0()(64bit) \
libnextcloudsync0 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

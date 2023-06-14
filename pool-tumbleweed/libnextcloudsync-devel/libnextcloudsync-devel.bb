SUMMARY = "Development files for the Nextcloud synchronisation library"
DESCRIPTION = "Development files for the Nextcloud Desktop Client synchronisation \
library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "libnextcloudsync-devel-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "99212d94917f9a128a1a382bef471f1201bc7f762d5ddb0ab0ee7ee2aa2ecba06b5ff0d7b3828521ff9933fa05fe67f662710285a8910ca9a3814975db025ecb"

RPROVIDES:${PN} += "libnextcloudsync-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libnextcloud-csync.so.0 \
libnextcloudsync.so.0 \
libnextcloudsync0 \
libstdc++.so.6"

inherit rpm

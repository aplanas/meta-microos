SUMMARY = "libkdepim Akonadi library"
DESCRIPTION = "The Mail Transport library for Akonadi related functions"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5MailTransportAkonadi5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "765d8af6647452523ab5038fe225f7299500068dd74c68a96b2a08bb53852785a0b9b80689b0fe2b25a7fdd286cceff8fe8ed89ebf5c358706867c0e299585a5"

RPROVIDES:${PN} += "libKPim5MailTransportAkonadi.so.5 \
libKPim5MailTransportAkonadi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kmailtransport \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

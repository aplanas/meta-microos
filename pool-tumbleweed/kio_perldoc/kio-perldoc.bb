SUMMARY = "KDE KIO-Slave to browse Perl documentation"
DESCRIPTION = "This KDE KIO slave allows to browse the Perl documentation."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kio_perldoc-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a70f739debfec33c6c3b7eefcc502cc1ac4b95a7f31565096730f5242be2e75d3484179a0e64e10ff38be8fc6805a39b4804cd8e36876c62f4907f2482c9ba4e"

RPROVIDES:${PN} += "kdesdk-kioslaves \
kio-perldoc"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

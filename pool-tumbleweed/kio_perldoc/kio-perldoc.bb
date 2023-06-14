SUMMARY = "KDE KIO-Slave to browse Perl documentation"
DESCRIPTION = "This KDE KIO slave allows to browse the Perl documentation."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kio_perldoc-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "44c744fe0fa7e9967e22f4a5a0788beb196bcada33934761ca9051618cca256b53ab58993348af7cabfdb9e54f7a71184dd7c8417a7ad665dc02e9a140eb301f"

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

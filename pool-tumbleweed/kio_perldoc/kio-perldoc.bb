SUMMARY = "KDE KIO-Slave to browse Perl documentation"
DESCRIPTION = "This KDE KIO slave allows to browse the Perl documentation."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kio_perldoc-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "acf33cc48b81ea8563b2c7ee21cca200670dba2022a6985b269d91d11f07cd32bdbd6d01e9e0ea3967ed6f177697cd74ce2ff57924f6228a22226696ba1c3536"

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

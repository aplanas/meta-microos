SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kpackage-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "3b0f555c2ffba9fe8778cf350f9dfb69944215e70e4d87901676f2222853690df6499bbc38c14e507b5060ac02410e3670947a6bba19e648707ddfd6e04f2eda"

RPROVIDES:${PN} += "kpackage \
libKF5Package.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

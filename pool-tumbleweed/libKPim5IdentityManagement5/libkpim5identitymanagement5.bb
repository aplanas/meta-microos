SUMMARY = "KDE PIM Libraries: Identity Management - core library"
DESCRIPTION = "This package provides the core library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5IdentityManagement5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e247bb2d45a981c796fc736d9fc09694e00f4bfb8148b6d68a679e418f5d6c5d97397ad926f790dc906d8d36b882a76bdd56d377fe21d41608c5c87fe739e19a"

RPROVIDES:${PN} += "libKPim5IdentityManagement.so.5 \
libKPim5IdentityManagement5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

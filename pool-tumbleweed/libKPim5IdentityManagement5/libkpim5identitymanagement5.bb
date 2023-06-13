SUMMARY = "KDE PIM Libraries: Identity Management - core library"
DESCRIPTION = "This package provides the core library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5IdentityManagement5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c31e84bc8e355d4a68be228cf40d39cb63e7eb2c743fd859efc6f3294309d6a6444c5bfa1d2ae0307e95a616e2e0956309ade9d69eee1629258b277502b3dcec"

RPROVIDES:${PN} += "libKPim5IdentityManagement.so.5()(64bit) \
libKPim5IdentityManagement5 \
libKPim5IdentityManagement5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

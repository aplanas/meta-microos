SUMMARY = "KDE PIM Libraries: Identity Management - core library"
DESCRIPTION = "This package provides the core library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5IdentityManagement5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "105937e497ebbb837907cfb825c44e26d27d9657c9be4f1958dabb2b3746ea0126d3621ef14c77fc2aa8a499b0bcf760096f8da388ad3fc090182233a3eb6066"

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

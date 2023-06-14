SUMMARY = "KDE PIM Libraries"
DESCRIPTION = "This package contains additional libraries for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kldap-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0cafd2c266951cc8a149ffffe0d1741394dcb4375d964f4b332060531a43b78f9dcb513645b0defc58906b7660e99ff1d4e5fa6bfe3a9130614b3ca9f352f7b2"

RPROVIDES:${PN} += "kldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKPim5Ldap.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "KDE PIM Libraries"
DESCRIPTION = "This package contains additional libraries for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kldap-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "dabc1b5d0ef3a770c3c3c7e7005b4aa744526d58f74abd3618c3e77df8875007720ccda5b3485c52c402a66bb1cd721bdaf93653241077d250851b02b5d808d7"

RPROVIDES:${PN} += "kldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKPim5Ldap.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

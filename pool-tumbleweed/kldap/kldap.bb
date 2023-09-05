SUMMARY = "KDE PIM Libraries"
DESCRIPTION = "This package contains additional libraries for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kldap-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d3aa1da24d5b42fc4da68b01f4b4b8b3f16f1035b8ad99d581d645eefd3c5f7e9f727a3646dac132341c2f79f35684ca5e195ce7b0af20e3aab10ee729bbf0a4"

RPROVIDES:${PN} += "kldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKPim5Ldap.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Baloo Engine library"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's Engine library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "libKF5BalooEngine5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "d39bd228e33691e545a802652c2259c87901bd9851885ab47b996cf3e16af1465156c7842b7d958adf7f78c9111b64a268cae57e22c4d2e20f5a2a0814104959"

RPROVIDES:${PN} += "libKF5BalooEngine.so.5 \
libKF5BalooEngine5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libc.so.6 \
liblmdb-0.9.30.so \
libstdc++.so.6"

inherit rpm

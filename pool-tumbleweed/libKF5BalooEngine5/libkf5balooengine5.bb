SUMMARY = "Baloo Engine library"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's Engine library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "libKF5BalooEngine5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "390bc70ab60865bef5817d86ba9e2b447f62a0661777c8f206fc03e7d5a95f0482549ea390bfe2a5f5f99eb7304e1539b42a784cade8a57c3221af56e1e40c28"

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

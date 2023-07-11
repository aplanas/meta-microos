SUMMARY = "Baloo Engine library"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's Engine library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "libKF5BalooEngine5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d7afd4480aee1cce4b9c1bea7d3a4117c2fd1a592fad8a0c249a1c5e784b1231005e3ff7811712241ea278162db221267fa51c5d4526f41f2b310b776fb152ca"

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

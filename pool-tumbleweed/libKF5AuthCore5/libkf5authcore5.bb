SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5AuthCore5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "aba03c0f503650e1aca4b8da7ea1b885bae36c28b185ab3e9b68d8d8c9b0d045b814c906ea7f01e0112d9c900cabd5d5139a746eb4e799f4c397dbc1a2f2c6e4"

RPROVIDES:${PN} += "libKF5AuthCore.so.5 \
libKF5AuthCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Activities5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "860954aa6c3933f4be06aa10a60135ca9ac86189b28beffb793eb11252e8b5187ab97d7f6e94f2ae34a54b70ab2036381016298460df1a77069b90ca32478cbe"

RPROVIDES:${PN} += "libKF5Activities.so.5 \
libKF5Activities5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

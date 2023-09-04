SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Activities5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "29ea978acb2aeb8c3508aac47120c93448b175f68b9bd5ae75cb6f356f5a87f1647fabab0c14e5cdfaa287b55a098ebd1cd405976523f23690df6df872524f33"

RPROVIDES:${PN} += "libKF5Activities.so.5 \
libKF5Activities5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

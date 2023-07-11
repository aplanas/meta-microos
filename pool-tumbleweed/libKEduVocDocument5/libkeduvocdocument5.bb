SUMMARY = "Library for KDE Education Applications"
DESCRIPTION = "This package contains the library which is required by the KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKEduVocDocument5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "35c35f59c8834f84c335595a67e2bb7c15a6f045f7faf281fef2dfa70f4449b17a9166d1f9e847a8087a2b7685de63e8ceaccf7b0884ea50bf3e9248739ddfca"

RPROVIDES:${PN} += "libKEduVocDocument.so.5 \
libKEduVocDocument5 \
libkeduvocdocument"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Library for KDE Education Applications"
DESCRIPTION = "This package contains the library which is required by the KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKEduVocDocument5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "60790ed75b369bd2277ad748310e3fd2ede184137f098064ad4e9b02b99d749d160905f371800efbac6558b4ed5e702f1ce9873ca6b359bd94c48613fd18a7ec"

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

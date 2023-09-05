SUMMARY = "The archiver base class library"
DESCRIPTION = "The archiver base class, used by specific archive formats, is made \
available as a library in its own right so that support for other \
archive formats can be built outside the kio-extras source tree."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkioarchive5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "4d78f5d30761b6aa8a2756d694cd90421d185ae91de252f2fc15ae0d79068e035e5eaec94fb55879bfdbef9cb48870482f0c606cd4c5c2be2cb3b7a781e919d1"

RPROVIDES:${PN} += "libkioarchive.so.5 \
libkioarchive5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

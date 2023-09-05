SUMMARY = "Akonadi Private Server library"
DESCRIPTION = "This package includes the Private Akonadi library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AkonadiPrivate5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "53936bf2b72ffb3d4b07755a882fc116c9e2be29c40c5a4fd66c37e1f1a9e6042b082f29eee2fd6b90ac3b37ab1f2f88cddaa361b6a63623fbeeefefa1db9366"

RPROVIDES:${PN} += "libKPim5AkonadiPrivate.so.5 \
libKPim5AkonadiPrivate5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6"

inherit rpm

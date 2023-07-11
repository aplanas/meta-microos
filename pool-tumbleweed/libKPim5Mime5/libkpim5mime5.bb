SUMMARY = "KDE PIM libraries MIME Support"
DESCRIPTION = "This package provides MIME support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5Mime5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2cffd3e89a9752c82e2b91b8b5b9f68dcac0cc7247314aef594bef12e7fbacfb09dab604ace239caec51811532549f4bc2595a9075e555f0a55b25fff5be7643"

RPROVIDES:${PN} += "libKPim5Mime.so.5 \
libKPim5Mime5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

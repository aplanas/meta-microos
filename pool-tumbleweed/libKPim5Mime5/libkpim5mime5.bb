SUMMARY = "KDE PIM libraries MIME Support"
DESCRIPTION = "This package provides MIME support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Mime5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b28695bcaf0a0687211c8ca5ee0a48bfa4c498426add225163fef2a5f1b7681c31ea2265450d25ce0117da03b4101c80555951e6679550d59274d78488d3644b"

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

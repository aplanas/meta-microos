SUMMARY = "KDE PIM libraries MIME Support"
DESCRIPTION = "This package provides MIME support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5Mime5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "6870dc488ddb0e2476ed38a0cd3edd86cd158362660fdf401d9aac75b9ed4b1560d74533afd26a6d377a728b478996067fcc180c9814d4de228ca6c174f92384"

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

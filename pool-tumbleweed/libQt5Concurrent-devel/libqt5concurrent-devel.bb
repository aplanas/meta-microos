SUMMARY = "Development files for the Qt5 Concurrent library"
DESCRIPTION = "Development files for the Qt5 Concurrent library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Concurrent-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "bcb7d350cc74e96f5d8b6120088ae62917f3514d701dfe468b396862979fb56d3396ad6ed3da249480496193aa2043f999dcfb318b28b16d51715738c5a9d8ac"

RPROVIDES:${PN} += "cmake-Qt5Concurrent \
libQt5Concurrent-devel \
pkgconfig-Qt5Concurrent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Concurrent5 \
libQt5Core-devel \
pkgconfig-Qt5Core"

inherit rpm

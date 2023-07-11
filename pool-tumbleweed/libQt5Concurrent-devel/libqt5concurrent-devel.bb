SUMMARY = "Development files for the Qt5 Concurrent library"
DESCRIPTION = "Development files for the Qt5 Concurrent library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Concurrent-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "f6c56c3edca9bb761fb2c21eab5ffeed40125c0c3f098945cc05268eab5ffaac283fdc4fd49576decc7f684c442bc06eee81d7fab60258997870f5cf82990a9f"

RPROVIDES:${PN} += "cmake-Qt5Concurrent \
libQt5Concurrent-devel \
pkgconfig-Qt5Concurrent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Concurrent5 \
libQt5Core-devel \
pkgconfig-Qt5Core"

inherit rpm

SUMMARY = "Development files for the Qt5 testing library"
DESCRIPTION = "Development files for the Qt5 testing library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Test-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "5b8f6186ef779db1f27292d7b80a90683ea19824b4ae114f87ade91da98fd8f8b5b816259e0c280524b6efe5eee17d2c78220f364157ac1bb9dca008ac8e4ee7"

RPROVIDES:${PN} += "cmake(Qt5Test) \
libQt5Test-devel \
libQt5Test-devel(aarch-64) \
pkgconfig(Qt5Test)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Test5 \
pkgconfig(Qt5Core)"

inherit rpm

SUMMARY = "Development files for the Qt5 network library"
DESCRIPTION = "Development files for the Qt5 network library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Network-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "6ba6e6bbc6dfe6c885556a095467905aaf984bcb532c0df95d63b37791a18ae1a1b492f14b8f971b8c75e395e887fe2cfb65d7fa79c78f4cdc11c22b9c0d287c"

RPROVIDES:${PN} += "cmake-Qt5Network \
libQt5Network-devel \
pkgconfig-Qt5Network"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Network5 \
pkgconfig-Qt5Core"

inherit rpm

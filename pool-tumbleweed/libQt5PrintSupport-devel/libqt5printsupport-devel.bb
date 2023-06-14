SUMMARY = "Development files for the Qt5 print support library"
DESCRIPTION = "Development files for the Qt5 print support library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5PrintSupport-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "bba75102b1b39b149b0ca5e051cdc8fc0dc95ce5d8295f6c63fdda8984d84b8e1a1fefce3f19e94610d1754d5cd5d4ff248cae252a2f8c570f65fd0b56c83f22"

RPROVIDES:${PN} += "cmake-Qt5PrintSupport \
libQt5PrintSupport-devel \
pkgconfig-Qt5PrintSupport"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Gui-devel \
libQt5PrintSupport5 \
libQt5Widgets-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets"

inherit rpm

SUMMARY = "Development files for the Qt5 core library"
DESCRIPTION = "Development files for the Qt5 core library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Core-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "42bb52ca13eea71d49b4f472fbf69566b97d77ed39e3bb284a70b62666bdaa949be2698e96ed7642f929d64912bc3bbbd54115aabc9eae7c991814507663391e"

RPROVIDES:${PN} += "cmake(Qt5) \
cmake(Qt5Core) \
libQt5Core-devel \
libQt5Core-devel(aarch-64) \
pkgconfig(Qt5Core)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core5 \
libqt5-qtbase-common-devel"

inherit rpm

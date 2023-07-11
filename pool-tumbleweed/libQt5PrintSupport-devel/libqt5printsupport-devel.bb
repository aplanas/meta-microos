SUMMARY = "Development files for the Qt5 print support library"
DESCRIPTION = "Development files for the Qt5 print support library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PrintSupport-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "5370f54602ffce7e9fe26920de9873a918a976510635132462dba3c99fa93f0a0c3b0d3735ea8889d1d7fc16adaf158a9b75b7e42706b231312ef675ad8e751c"

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

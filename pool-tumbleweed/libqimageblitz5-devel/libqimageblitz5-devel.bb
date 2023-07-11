SUMMARY = "Development files for libqimageblitz5"
DESCRIPTION = "This package contains development files for libqimageblitz5."
LICENSE = "BSD-2-Clause"

PV = "0.0.6+svn1515099"

RPM_NAME = "libqimageblitz5-devel-0.0.6+svn1515099-4.14.aarch64.rpm"
RPM_HASH = "9418ccaf513e30674eaf344ee891cdefa7f86a39c4846e55c01868e81698086bdece92a4bdbb929b5272d47146df9d6bb4b7b1942b24edba3144222fb3e72cfd"

RPROVIDES:${PN} += "libqimageblitz5-devel \
pkgconfig-qimageblitz5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqimageblitz5-1 \
libqimageblitz5.so.1 \
libstdc++.so.6 \
pkgconfig-Qt5Gui"

inherit rpm

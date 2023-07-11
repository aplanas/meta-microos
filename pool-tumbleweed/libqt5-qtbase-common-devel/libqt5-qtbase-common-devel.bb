SUMMARY = "Qt 5 Core Development Binaries"
DESCRIPTION = "Qt 5 Core Development Binaries. It contains Qt5's moc, qmake, \
rcc, uic and syncqt.pl binaries."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-common-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "c575b612f225dd8dd9aa2671282d0cbad171d6d779096c7014be9f953b1c37ae0b05ee3eef1c5d0e1597151c84ded40862043ae04a50020ff91fa561b6781386"

RPROVIDES:${PN} += "libqt5-qtbase-common-devel \
rpm-macro--libqt5-archdatadir \
rpm-macro--libqt5-bindir \
rpm-macro--libqt5-datadir \
rpm-macro--libqt5-docdir \
rpm-macro--libqt5-examplesdir \
rpm-macro--libqt5-importdir \
rpm-macro--libqt5-includedir \
rpm-macro--libqt5-libdir \
rpm-macro--libqt5-libexecdir \
rpm-macro--libqt5-plugindir \
rpm-macro--libqt5-prefix \
rpm-macro--libqt5-qmake \
rpm-macro--libqt5-sysconfdir \
rpm-macro--libqt5-translationdir \
rpm-macro-make-jobs \
rpm-macro-qmake5 \
rpm-macro-qmake5-install"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
cmake \
gcc-c++ \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
pkg-config"

inherit rpm

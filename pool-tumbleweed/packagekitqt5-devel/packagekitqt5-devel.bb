SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "packagekitqt5-devel-1.1.1-1.2.aarch64.rpm"
RPM_HASH = "d1d781c7231e0235c6c5c177ac881211b22d00d26ac0ee3b921299c8e1f88bcc24ef663b75a3753c739e12f15c77522901bf6db75dff3457b477d7096969443b"

RPROVIDES:${PN} += "PackageKit-Qt-devel \
PackageKit-Qt5-devel \
cmake-packagekitqt5 \
packagekitqt5-devel \
pkgconfig-packagekitqt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpackagekitqt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5DBus"

inherit rpm

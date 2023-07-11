SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libpackagekitqt5-1-1.1.1-1.2.aarch64.rpm"
RPM_HASH = "1ea708f9ba472aca1a65831536f0c653f9244e48e7ab0eacabf7418f1ed41f11b4fb1c134bd70cfc9539196ef81f65a05fe965c0a8ab0ef567e570e60659aba1"

RPROVIDES:${PN} += "libpackagekitqt5-1 \
libpackagekitqt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

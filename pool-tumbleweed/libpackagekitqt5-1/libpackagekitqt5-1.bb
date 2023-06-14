SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libpackagekitqt5-1-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "80601345955cc939a07029d07e21589546578b71b3ab968b606a86fa4aeefc5ba98439e4ff536c558c4d56e288ec8645f684b64c65d5ba658c012aa70b70e492"

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

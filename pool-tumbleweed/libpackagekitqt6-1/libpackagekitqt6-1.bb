SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libpackagekitqt6-1-1.1.1-1.2.aarch64.rpm"
RPM_HASH = "b2f3353c06abc7592316cf8ee40497c41c3145ea8b366401842f57d67515caaf092292a8eee33fb4ff7e9dd5457ed48cd05878ffcd96b0765b8d038191ef9a54"

RPROVIDES:${PN} += "libpackagekitqt6-1 \
libpackagekitqt6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

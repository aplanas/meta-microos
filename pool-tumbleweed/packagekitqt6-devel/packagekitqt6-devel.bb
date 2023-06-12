SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "packagekitqt6-devel-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "c194c78ecf9dcbf886f49f18a11ba8bfcbc3af43658c8de2d4451cf0bc6ff5c22cfeceb78b38f313bb592d2e28a50cd5749a84f1ec0d41a7578d31fc31ab25f4"

RPROVIDES:${PN} += "cmake(packagekitqt6) \
packagekitqt6-devel \
packagekitqt6-devel(aarch-64) \
pkgconfig(packagekitqt6)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpackagekitqt6-1 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6DBus)"

inherit rpm

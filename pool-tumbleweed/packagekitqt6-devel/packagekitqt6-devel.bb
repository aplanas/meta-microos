SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "packagekitqt6-devel-1.1.1-1.2.aarch64.rpm"
RPM_HASH = "ed22cb0d6e8ef01f7777aad63d05d05dd0778908c82be79bdad69b6699586588717bba5ed80ea0f268cf2f2373f7e6f38ab463461921dd322d79f481512c79e6"

RPROVIDES:${PN} += "cmake-packagekitqt6 \
packagekitqt6-devel \
pkgconfig-packagekitqt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpackagekitqt6-1 \
pkgconfig-Qt6Core \
pkgconfig-Qt6DBus"

inherit rpm

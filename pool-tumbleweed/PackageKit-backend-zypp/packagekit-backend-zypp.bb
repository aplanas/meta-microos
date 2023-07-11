SUMMARY = "Zypp backend for the PackageKit installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-backend-zypp-1.2.5-9.4.aarch64.rpm"
RPM_HASH = "c3d020b5bd1fae3ae38d7375d4470f8855c5931f8b6d720d9c83ee69f2203ab8568bf3208ad4ed437acb36d9ed777c24cd2f16c16751add59f9fb4ba6a262251"

RPROVIDES:${PN} += "PackageKit-backend \
PackageKit-backend-zypp \
libpk-backend-zypp.so"

RDEPENDS:${PN} += "PackageKit \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libpackagekit-glib2.so.18 \
libstdc++.so.6 \
libzypp \
libzypp.so.1722"

inherit rpm

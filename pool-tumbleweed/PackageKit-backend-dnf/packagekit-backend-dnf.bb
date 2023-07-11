SUMMARY = "DNF backend for the PackageKit installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-backend-dnf-1.2.5-9.4.aarch64.rpm"
RPM_HASH = "8a12ca913ec4678e6f1d5b138769ce35f22d6c6fe88b490667e85b668393a74310d644d2d567257bdb4016f36b6d33ebe9abb67a49102d61edf8a2075086b619"

RPROVIDES:${PN} += "PackageKit-backend \
PackageKit-backend-dnf \
libpk-backend-dnf.so"

RDEPENDS:${PN} += "PackageKit \
ld-linux-aarch64.so.1 \
libappstream-glib.so.8 \
libc.so.6 \
libdnf.so.2 \
libdnf2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpackagekit-glib2.so.18 \
librpmio.so.9"

inherit rpm

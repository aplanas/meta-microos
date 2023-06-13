SUMMARY = "DNF backend for the PackageKit installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-backend-dnf-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "557d4d2abd40cd8370ab2326358ae6e3f1cb684866455d1622c4887af94f3e831020abc9425358aff6c61ec03fa6999a907a6f34a9d279182a1089428c49b888"

RPROVIDES:${PN} += "PackageKit-backend \
PackageKit-backend-dnf \
PackageKit-backend-dnf(aarch-64) \
libpk_backend_dnf.so()(64bit)"

RDEPENDS:${PN} += "PackageKit \
ld-linux-aarch64.so.1()(64bit) \
libappstream-glib.so.8()(64bit) \
libc.so.6()(64bit) \
libdnf.so.2()(64bit) \
libdnf2 \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpackagekit-glib2.so.18()(64bit) \
librpmio.so.9()(64bit)"

inherit rpm

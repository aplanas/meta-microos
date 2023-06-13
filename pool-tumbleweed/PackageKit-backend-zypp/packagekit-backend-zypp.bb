SUMMARY = "Zypp backend for the PackageKit installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-backend-zypp-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "2d2c92a2e34373646d29579072a65e319b35645cc91838d29642daab721c4664aa5a90b834f06df1970ae584540b660145075679b839d43682d7abd517bc77ed"

RPROVIDES:${PN} += "PackageKit-backend \
PackageKit-backend-zypp \
PackageKit-backend-zypp(aarch-64) \
libpk_backend_zypp.so()(64bit)"

RDEPENDS:${PN} += "PackageKit \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libpackagekit-glib2.so.18()(64bit) \
libstdc++.so.6()(64bit) \
libzypp \
libzypp.so.1722()(64bit) \
libzypp.so.1722(ZYPP_plain)(64bit)"

inherit rpm

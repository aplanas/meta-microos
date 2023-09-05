SUMMARY = "Development headers and libraries for libapparmor"
DESCRIPTION = "These libraries are needed for developing software that makes use of the \
AppArmor API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "libapparmor-devel-3.1.6-4.1.aarch64.rpm"
RPM_HASH = "e0e0d3772f5788dd2c9421b2530e83cf901a111f96c52c4fca23df0fa77a650e176b75c36ce7461f5b9908f3d131e63c12af0120cff17187d658ffe1b168ceb7"

RPROVIDES:${PN} += "libapparmor-/usr/include/sys/apparmor.h \
libapparmor-devel \
pkgconfig-libapparmor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libapparmor1"

inherit rpm

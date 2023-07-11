SUMMARY = "Development headers and libraries for libapparmor"
DESCRIPTION = "These libraries are needed for developing software that makes use of the \
AppArmor API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "libapparmor-devel-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "ee188568608fd3701580981577d324b11ffc963f26e3c30a4cf198cbce5b1bbdbc3dbd16d699d4bc4e6a78806b4efc090a159f2ea57fcdd53a619768ed70eada"

RPROVIDES:${PN} += "libapparmor-/usr/include/sys/apparmor.h \
libapparmor-devel \
pkgconfig-libapparmor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libapparmor1"

inherit rpm

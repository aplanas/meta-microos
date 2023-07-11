SUMMARY = "Development files for Audacious"
DESCRIPTION = "Development files for Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "audacious-devel-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "2d4b7d6d7dcecfd6280aaa3565b481a21dd85da2b46cfdd9820161cda4d254261bf383ab96084196db1fb2aeddd34752fd137602e9485f41d63793a6c3d99d05"

RPROVIDES:${PN} += "audacious-devel \
pkgconfig-audacious"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudcore5 \
libaudgui5 \
libaudqt2 \
libaudtag3"

inherit rpm

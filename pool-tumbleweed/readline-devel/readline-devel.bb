SUMMARY = "Development files for readline"
DESCRIPTION = "This package contains the header files for the readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.2"

RPM_NAME = "readline-devel-8.2-2.3.aarch64.rpm"
RPM_HASH = "e6e593afdb8142fee1505d4c86dc0de9773f6a7b23acbdd24f92c1ecd5d9afdc4280254ac9bf6c674ec2fc1d6c8b989cb9ab59f710de806eec7c7aa6f8af9b2a"

RPROVIDES:${PN} += "pkgconfig-history \
pkgconfig-readline \
readline-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libreadline8 \
ncurses-devel \
pkgconfig-tinfo"

inherit rpm

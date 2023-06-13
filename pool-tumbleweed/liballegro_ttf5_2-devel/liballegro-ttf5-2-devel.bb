SUMMARY = "Development files for liballegro_ttf"
DESCRIPTION = "Development files needed to build applications which use liballegro_ttf."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_ttf5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "57b95cab64681e95d66fadef0fa47ad8bafe575dcc986899c704b842f80001079886d6f05e103006612bd07504d85703c03be9b3e7f2df2c45a38dd149100635"

RPROVIDES:${PN} += "liballegro_ttf5_2-devel \
liballegro_ttf5_2-devel(aarch-64) \
pkgconfig(allegro_ttf-5)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro_ttf5_2 \
pkgconfig(allegro_font-5)"

inherit rpm

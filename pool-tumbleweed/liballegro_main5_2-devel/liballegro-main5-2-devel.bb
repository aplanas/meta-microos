SUMMARY = "Development files for liballegro_main"
DESCRIPTION = "Development files needed to build applications which use liballegro_main."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_main5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "6eaef5d68c66677545fc5ed000416b201e050b8131f40d4d9babfa5d1255fb07caf6ff20cd7eab35e5ae0ee9193aeeb28f44683723c5f9e873e9c485e91b2fa3"

RPROVIDES:${PN} += "liballegro-main5-2-devel \
pkgconfig-allegro-main-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-main5-2 \
pkgconfig-allegro-5"

inherit rpm

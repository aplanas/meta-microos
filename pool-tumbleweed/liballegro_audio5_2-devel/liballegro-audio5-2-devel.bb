SUMMARY = "Development files for liballegro_audio"
DESCRIPTION = "Development files needed to build applications which use liballegro_audio."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_audio5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "4dc4c32c6a1734424ccd5db2ded85af23e7bc1e7973359df6f93b2cda352dcd018b0315bc06463406ff53fa8288283ffb6ef834daa082d161b514b495df0b3fb"

RPROVIDES:${PN} += "liballegro-audio5-2-devel \
pkgconfig-allegro-audio-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-audio5-2 \
pkgconfig-allegro-5"

inherit rpm

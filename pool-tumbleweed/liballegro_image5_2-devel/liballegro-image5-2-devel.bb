SUMMARY = "Development files for liballegro_image"
DESCRIPTION = "Development files needed to build applications which use liballegro_image."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_image5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "661669b4585d6a42a3af1ff0134f8f01703b990c932f2eb722c15cd18c6eee36e5d155af1c50c48982a2bfd9926324955a6313cceb2ca2e342ac0e0568b1e0cf"

RPROVIDES:${PN} += "liballegro_image5_2-devel \
liballegro_image5_2-devel(aarch-64) \
pkgconfig(allegro_image-5)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro_image5_2 \
pkgconfig(allegro-5)"

inherit rpm

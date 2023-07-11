SUMMARY = "Development files for liballegro_acodec"
DESCRIPTION = "Development files needed to build applications which use liballegro_acodec."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_acodec5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "7167a591ddc345307cc84ba86c44cd4b19a09e86d900a9e97fc6659dfdea2e0be0ef5d0d2db12524e4a48fd484e654eebc047e238a6752b45c7c2b6aac00103e"

RPROVIDES:${PN} += "liballegro-acodec5-2-devel \
pkgconfig-allegro-acodec-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-acodec5-2 \
pkgconfig-allegro-audio-5"

inherit rpm

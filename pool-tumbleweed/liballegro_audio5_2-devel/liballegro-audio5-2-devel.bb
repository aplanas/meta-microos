SUMMARY = "Development files for liballegro_audio"
DESCRIPTION = "Development files needed to build applications which use liballegro_audio."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_audio5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "0a174c3400ce93c1b4672cc4d37dbe39940518ffe404d158c0debd045275478da4f49f7cb674f5693101cf69bbc2a999d456ecf01916c274ab6fd53fa909aa58"

RPROVIDES:${PN} += "liballegro-audio5-2-devel \
pkgconfig-allegro-audio-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-audio5-2 \
pkgconfig-allegro-5"

inherit rpm

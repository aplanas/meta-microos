SUMMARY = "Development files for noson library"
DESCRIPTION = "Development files for noson library. The noson library supports basic features \
to browse music index and control playback in any zones."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.2"

RPM_NAME = "noson-devel-2.10.2-1.2.aarch64.rpm"
RPM_HASH = "59b4a97cdd44155d040ded94545566b0dfd283962983139ab24b381fcbd837a62b6a90e442517f223c557933465329aa747e8043498c51be0f0e7314b93edf7b"

RPROVIDES:${PN} += "cmake-noson \
noson-devel \
pkgconfig-noson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnoson2"

inherit rpm

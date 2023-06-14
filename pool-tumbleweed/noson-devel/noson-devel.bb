SUMMARY = "Development files for noson library"
DESCRIPTION = "Development files for noson library. The noson library supports basic features \
to browse music index and control playback in any zones."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.2"

RPM_NAME = "noson-devel-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "167c2726121cdab2d91414a6ba38da9a2c4823f881ecbd6e7eb8c655cfcdc8bbff350c19cabe9d0fc3ab45101de129919a8afa8c81b9e0682118b5c080f52e04"

RPROVIDES:${PN} += "cmake-noson \
noson-devel \
pkgconfig-noson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnoson2"

inherit rpm

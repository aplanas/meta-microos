SUMMARY = "FAudio Development Libraries"
DESCRIPTION = "FNA is a reimplementation of the Microsoft XNA Game Studio 4.0 Refresh libraries."
LICENSE = "Zlib"

PV = "23.03"

RPM_NAME = "FAudio-devel-23.03-1.3.aarch64.rpm"
RPM_HASH = "1ee70a147f475e32ef9cffbac62a7ea85981aa557577ed2daab5a10c1507cd80da48aa6a081a526c04376314247286639d3fc2d45f0b72029661b6e96dd1e32b"

RPROVIDES:${PN} += "FAudio-devel \
FAudio-devel(aarch-64) \
cmake(FAudio) \
pkgconfig(FAudio)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libFAudio0"

inherit rpm

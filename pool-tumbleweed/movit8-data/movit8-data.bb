SUMMARY = "Data files for the Movit GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the architecture-independent data files (GLSL \
fragment shaders)."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.3"

RPM_NAME = "movit8-data-1.6.3-1.16.noarch.rpm"
RPM_HASH = "9200f949dbdc80accd3719cf9b271428a0e567d8a9d7f5d470dd9cd15ee554edc8cdaaee4be0a5d20a075906b2c90b443353440889aa68f140823f2a8cc4c60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "movit-data \
movit8-data"

RDEPENDS:${PN} += ""

inherit rpm

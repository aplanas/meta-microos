SUMMARY = "Sndfile plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the Sndfile plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-sndfile-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "17ed483b286c6459321f92937bcd0422f651af4e8af076d3b6a8a03e80e006096b9eb3fdaeea45d2654033506c1ef8f9168aebeb22167e52a2941e813a286b90"

RPROVIDES:${PN} += "audaspace-fileplugin \
audaspace-plugin-sndfile \
libaudlibsndfile.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libc.so.6 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm

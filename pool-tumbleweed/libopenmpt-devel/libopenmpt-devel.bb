SUMMARY = "Development files for libopenmpt"
DESCRIPTION = "This package contains the development files required to compile programs \
using libopenmpt."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "libopenmpt-devel-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "09dce13556ebb188a3e3b57aa9b1dbcecf6d9e0dfd1f25a90cb0d712d798298faa37498c4da3ce0b21d4572562829f84ddf12e1b194c80eef6e6122f80e9ed3f"

RPROVIDES:${PN} += "libopenmpt-devel \
pkgconfig-libopenmpt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenmpt0 \
pkgconfig-libmpg123 \
pkgconfig-ogg \
pkgconfig-vorbis \
pkgconfig-vorbisfile \
pkgconfig-zlib"

inherit rpm

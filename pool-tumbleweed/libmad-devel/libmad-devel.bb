SUMMARY = "Development package for libmad, an MP3 decoding library"
DESCRIPTION = "This package contains the header files needed to \
develop applications with libmad."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.1b"

RPM_NAME = "libmad-devel-0.15.1b-6.3.aarch64.rpm"
RPM_HASH = "e953ecfc91ae351b11d7c4e10c9dfb3a36ab288db026d3a967d9212668fb91a304cbae9176a4866d4014683225fd30b00a186aacbf9e3a39ee847747c5777872"

RPROVIDES:${PN} += "libmad-devel \
mad-devel \
pkgconfig-mad"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmad0"

inherit rpm

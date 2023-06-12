SUMMARY = "Development files for the EBML file parser library"
DESCRIPTION = "libebml is a C++ library to parse EBML files. See the EBML RFC at \
http://www.matroska.org/technical/specs/rfc/index.html ."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "libebml-devel-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "9d5424e9bf2e7408de053d2ef13a6c7b93d023e430293c50df1b22db21b6973d0d8be226ecf6e1984e06ee435c1409698109926a0bdc171600cbb0d0abad6390"

RPROVIDES:${PN} += "cmake(EBML) \
libebml-devel \
libebml-devel(aarch-64) \
pkgconfig(libebml)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libebml5 \
libstdc++-devel"

inherit rpm

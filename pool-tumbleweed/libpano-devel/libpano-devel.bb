SUMMARY = "Panorama Tools Back-End Library"
DESCRIPTION = "Development files for library for working with panoramas."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.21"

RPM_NAME = "libpano-devel-2.9.21-1.8.aarch64.rpm"
RPM_HASH = "e54d27f1d8680b6138579a830471a63c95893cae60590df5c5cd47cfc79fa69cfab8f3368becd76030056c00f6c0a163f4d46afb28fb52e8e02f20356f1847ab"

RPROVIDES:${PN} += "libpano-devel \
libpano-devel(aarch-64) \
pkgconfig(libpano13)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libpano13-3"

inherit rpm

SUMMARY = "Development package for libmad, an MP3 decoding library"
DESCRIPTION = "This package contains the header files needed to \
develop applications with libmad."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.1b"

RPM_NAME = "libmad-devel-0.15.1b-6.2.aarch64.rpm"
RPM_HASH = "3cbb19db41591f09532d07c51ee8c5bb8a71d8a90565241effb51887543ae1cffc66a793e9f2014319037a3680d503a6be2ac5433c7544c546063fdcf5a0e0c4"

RPROVIDES:${PN} += "libmad-devel \
mad-devel \
pkgconfig-mad"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmad0"

inherit rpm

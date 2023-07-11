SUMMARY = "Development files for libcollection"
DESCRIPTION = "A data-type to collect data in a hierarchical structure for easy iteration \
and serialization"
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.0"

RPM_NAME = "libcollection-devel-0.7.0-28.1.aarch64.rpm"
RPM_HASH = "cfe3d2d38bf4d887e46da68010389e598131a9889902609a1902fd1d7649f2cd52b06fb93741f192ed6fb440173e5fa3e7f51617379e055a045f58a19c17061b"

RPROVIDES:${PN} += "libcollection-devel \
pkgconfig-collection"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcollection4"

inherit rpm

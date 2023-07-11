SUMMARY = "Library for loading Gigasampler and DLS Level 1/2 files"
DESCRIPTION = "C++ library for loading Gigasampler and DLS Level 1/2 files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "libgig-devel-4.3.0-1.10.aarch64.rpm"
RPM_HASH = "a5b577d7dc451f9a27f93341b37626c563a4abb5624af263364b6009cd37f57494ddf62747f35fb6a4cdf69bebe02ea98cfd5e0f6bfc165ee57221524e5f8d49"

RPROVIDES:${PN} += "libgig-devel \
pkgconfig-akai \
pkgconfig-gig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgig10"

inherit rpm

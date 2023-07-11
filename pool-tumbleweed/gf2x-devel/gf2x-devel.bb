SUMMARY = "Development headers for libgf2x"
DESCRIPTION = "gf2x is a library for fast multiplication of polynomials over the \
GF(2) binary field. \
 \
This package contains the interface definitions for the gf2x library."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "gf2x-devel-1.3.0-2.11.aarch64.rpm"
RPM_HASH = "69bad722a1759a77b637a733b8fa85519702027f92fc3e57929a2afadf9490566f23639c9fcb4991965068c4e07abe4f5b4bfae7e0693253a7b02270c457c208"

RPROVIDES:${PN} += "gf2x-devel \
pkgconfig-gf2x"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgf2x3"

inherit rpm

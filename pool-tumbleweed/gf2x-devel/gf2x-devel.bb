SUMMARY = "Development headers for libgf2x"
DESCRIPTION = "gf2x is a library for fast multiplication of polynomials over the \
GF(2) binary field. \
 \
This package contains the interface definitions for the gf2x library."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "gf2x-devel-1.3.0-2.10.aarch64.rpm"
RPM_HASH = "a73c0753821e48c257f13cda841a8fcb9f67a069f430a9473a5f822731e7f6949a3038b08cb8488a5d733ff6ec9ca1c5c4dd99de89ab98a10e7b4257eb3973b5"

RPROVIDES:${PN} += "gf2x-devel \
gf2x-devel(aarch-64) \
pkgconfig(gf2x)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgf2x3"

inherit rpm

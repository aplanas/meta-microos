SUMMARY = "The GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-libgmp10-6.1.1-3.11.noarch.rpm"
RPM_HASH = "44411af14835009bd6aed0c4f20d781a2ec6ac757f7f970b2bed9dae74a242d7dfa8a4957bdf2d173d925ada3ef9e5502be022d89618f78ddc3086b98378569f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(libgmp-10.dll) \
mingw32-libgmp \
mingw32-libgmp10"

RDEPENDS:${PN} += "mingw32(libgcc_s_sjlj-1.dll)"

inherit rpm

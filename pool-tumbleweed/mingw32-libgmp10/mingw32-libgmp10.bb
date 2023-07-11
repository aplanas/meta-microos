SUMMARY = "The GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-libgmp10-6.1.1-3.13.noarch.rpm"
RPM_HASH = "684801d42e2b1cb4a4eda5dafb39fd27bf7a58abedb6018ed1c8efdaeab81d18915b22d3257083c9c24f37e5dfc299294be97b34e5bd6e799f3d82a7c6ecd38a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libgmp \
mingw32-libgmp-10.dll \
mingw32-libgmp10"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll"

inherit rpm

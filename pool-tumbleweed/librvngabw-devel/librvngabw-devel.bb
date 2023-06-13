SUMMARY = "An AbiWord document generator library"
DESCRIPTION = "librvngabw is a library for generating AbiWord documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-devel-0.0.3-1.3.aarch64.rpm"
RPM_HASH = "cbc9895d5218feff376b3d2c6ab7351b539aec7a89663cc9f119785ac30887826867c6f0538a0b372e12347056c1c214d0218494d23865b190b45c62c65da810"

RPROVIDES:${PN} += "librvngabw-devel \
librvngabw-devel(aarch-64) \
pkgconfig(librvngabw-0.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librvngabw-0_0-0 \
pkgconfig(librevenge-0.0) \
pkgconfig(librevenge-stream-0.0)"

inherit rpm

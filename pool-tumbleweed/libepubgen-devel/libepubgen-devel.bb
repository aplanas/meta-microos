SUMMARY = "Development files for libepubgen"
DESCRIPTION = "libepubgen is a library for generating EPUB documents. It is directly \
pluggable into import filters based on librevenge. \
 \
This package contains the libepubgen development files."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-devel-0.1.1-1.21.aarch64.rpm"
RPM_HASH = "4ec645827370eb679ae4b5a5dea60d9d4d3959675c5641559db028ce02a3a3d4345d588d7c4ab67a105cf66cbf63ad613a5ee4c09cb352e3b7422a3a04d3e0a5"

RPROVIDES:${PN} += "libepubgen-devel \
libepubgen-devel(aarch-64) \
pkgconfig(libepubgen-0.1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libepubgen-0_1-1 \
pkgconfig(librevenge-0.0)"

inherit rpm

SUMMARY = "Development files for libepubgen"
DESCRIPTION = "libepubgen is a library for generating EPUB documents. It is directly \
pluggable into import filters based on librevenge. \
 \
This package contains the libepubgen development files."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-devel-0.1.1-1.22.aarch64.rpm"
RPM_HASH = "c3c7f108b5d61aaafdb654e43b994ae9e29cde4302f0e2b665ed850a72017b55d6b405e727ca9e4504dce9c26a4ff1e8d117aff7033683796a5f59b814bed988"

RPROVIDES:${PN} += "libepubgen-devel \
pkgconfig-libepubgen-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libepubgen-0-1-1 \
pkgconfig-librevenge-0.0"

inherit rpm

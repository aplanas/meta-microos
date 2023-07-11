SUMMARY = "Development files for sexpp"
DESCRIPTION = "This is a C++ library for working with S-expressions. S-expressions \
are a data structure for representing complex data as a variation on \
LISP S-expressions. \
 \
This package contains the files required for developing using sexpp."
LICENSE = "MIT"

PV = "0.8.7"

RPM_NAME = "sexpp-devel-0.8.7-1.1.aarch64.rpm"
RPM_HASH = "5d77001ddcb0361dd836b69bbd0e430630c2dce8d983abe2ed842af23a4b7230f479699cb31c6a063ce6e215a3e2e5585a643160c555591cb503f2831be976f2"

RPROVIDES:${PN} += "pkgconfig-sexpp \
sexpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsexpp0"

inherit rpm

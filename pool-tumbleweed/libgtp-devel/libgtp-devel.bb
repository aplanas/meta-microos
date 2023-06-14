SUMMARY = "Development files for the GTP library"
DESCRIPTION = "libgtp implements the GPRS Tunneling Protocol between SGSN and GGSN. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libgtp."
LICENSE = "GPL-2.0-only"

PV = "1.10.1"

RPM_NAME = "libgtp-devel-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "0574b6d7d09eb586bcaa9e14955e1f6ebe6654abe8327ab95543d84c826e883f29751814d68c5316863ddd3215ed5c8fe952b2a42e857056999a375388cdea51"

RPROVIDES:${PN} += "libgtp-devel \
pkgconfig-libgtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtp6"

inherit rpm

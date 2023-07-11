SUMMARY = "Development files for libfdata"
DESCRIPTION = "Library to provide generic file data functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfdata."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libfdata-devel-20230319-1.2.aarch64.rpm"
RPM_HASH = "21224ea3e61aa06816037a9074e6d658db7ded323017772899edc3d065d7398fca4d7ced48f4e4ebdd93d3abadb2cb214079073114ec5e398abdfd5c2b333160"

RPROVIDES:${PN} += "libfdata-devel \
pkgconfig-libfdata"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdata1"

inherit rpm

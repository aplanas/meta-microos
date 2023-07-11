SUMMARY = "Development files for the uriparser URL parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
This subpackage contains the headers and other developments \
files needed to build packagesfor that depend on uriparser."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "uriparser-devel-0.9.7-1.4.aarch64.rpm"
RPM_HASH = "faf1a5c5f6f5b8aa02bedd5dc76053a9c5415d5c589448c09c37caaeeaf3b2b92b5c9aedd471cb7b4799947f15d8f196add6ecf77c09c3bd0a817d0ec780c025"

RPROVIDES:${PN} += "cmake-uriparser \
liburiparser-devel \
pkgconfig-liburiparser \
uriparser-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liburiparser1"

inherit rpm

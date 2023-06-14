SUMMARY = "Development files for the uriparser URL parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
This subpackage contains the headers and other developments \
files needed to build packagesfor that depend on uriparser."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "uriparser-devel-0.9.7-1.3.aarch64.rpm"
RPM_HASH = "10b1beb634ac30a2612695a896e41bcc032993516e8a4b223faac64cfb44e17d6197edc2cf33d757cc2e6e9e61e745778098ff08f69370367cbe624cb0158aa8"

RPROVIDES:${PN} += "cmake-uriparser \
liburiparser-devel \
pkgconfig-liburiparser \
uriparser-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liburiparser1"

inherit rpm

SUMMARY = "A library for parsing Embedded OpenType font files"
DESCRIPTION = "libeot is a library for parsing Embedded OpenType files (Microsoft \
embedded font 'standard') and converting them to other formats."
LICENSE = "MPL-2.0"

PV = "0.01"

RPM_NAME = "libeot-devel-0.01-1.27.aarch64.rpm"
RPM_HASH = "d1137716b9f5926d40ee7c7768b87a741ac8a250bbb05e3b80e6af45cbc3fbcb92d5120bbe96ec2985b18b4d553a0d9b832165a2ac6b7afa3ea60593b6bf1f3b"

RPROVIDES:${PN} += "libeot-devel \
pkgconfig-libeot"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libeot0"

inherit rpm

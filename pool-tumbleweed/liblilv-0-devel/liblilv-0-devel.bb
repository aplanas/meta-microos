SUMMARY = "Development files for liblilv"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications. \
This subpackage contains the development files for liblilv."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "liblilv-0-devel-0.24.20-2.1.aarch64.rpm"
RPM_HASH = "d500d9f048551b74e5dc5858f53f7d1a35d5b19618e0d60cd4dc17695c1ddcfe6f6a5da726bc712fb811ab4c7104409a6387f129bdac4e39ddb9dd1a6a410a0a"

RPROVIDES:${PN} += "liblilv-0-devel \
pkgconfig-lilv-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblilv-0-0 \
pkgconfig-lv2 \
pkgconfig-serd-0 \
pkgconfig-sord-0 \
pkgconfig-sratom-0"

inherit rpm

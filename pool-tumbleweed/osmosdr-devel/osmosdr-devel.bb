SUMMARY = "Development files for OsmoSDR"
DESCRIPTION = "Library headers for OsmoSDR. \
OsmoSDR is a software-based small form factor Software Defined Radio project."
LICENSE = "GPL-3.0"

PV = "0.1+git.20151211"

RPM_NAME = "osmosdr-devel-0.1+git.20151211-1.25.aarch64.rpm"
RPM_HASH = "2c807a528a18954742d946806d0aa8667dd92a42a2e75f2832945464424723105213ca8f028c743803906424fe297ca58f762b70887572e9c7885bdbddda4a13"

RPROVIDES:${PN} += "osmosdr-devel \
pkgconfig-libosmosdr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmosdr0"

inherit rpm

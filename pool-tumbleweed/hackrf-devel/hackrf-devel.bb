SUMMARY = "Development files for HackRF"
DESCRIPTION = "Library headers for the hackrf driver."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "hackrf-devel-2023.01.1-1.3.aarch64.rpm"
RPM_HASH = "577302ee96592b47d79e14f2fb0db0d3abb1d74f60e7232d6bf20a17138498994ef67743b32e0ff65867e9ab787593f34e869720918e7a312a6d6e28e194e525"

RPROVIDES:${PN} += "hackrf-devel \
pkgconfig-libhackrf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhackrf0"

inherit rpm

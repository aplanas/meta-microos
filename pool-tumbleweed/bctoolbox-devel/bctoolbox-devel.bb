SUMMARY = "Development files for bctoolbox, a utility library for linphone/belle-sip/etc"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package contains development files."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "bctoolbox-devel-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "9e763b05a8d195b1032e10af34d684c5a422fb2cdaeff4fd5da9bed81ad4534dd67acdd0bb1feb0a9b09b49f207adfb8f1f4fbe2628cf4eaa0b03510cf9531a0"

RPROVIDES:${PN} += "bctoolbox-devel \
pkgconfig-bctoolbox \
pkgconfig-bctoolbox-tester"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libbctoolbox-tester1 \
libbctoolbox1 \
mbedtls-devel \
pkgconfig-bcunit \
pkgconfig-zlib"

inherit rpm

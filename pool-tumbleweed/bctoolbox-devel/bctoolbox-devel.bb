SUMMARY = "Development files for bctoolbox, a utility library for linphone/belle-sip/etc"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package contains development files."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "bctoolbox-devel-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "8db5353b1c578bc9bd17956da90d7f617ea17a72d402b4582cb95a22a062978c58fa63ef96a22ef4148ac926aeaf28443f9833eed3687d580cfb717f0763db64"

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

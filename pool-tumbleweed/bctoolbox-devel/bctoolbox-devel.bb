SUMMARY = "Development files for bctoolbox, a utility library for linphone/belle-sip/etc"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package contains development files."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "bctoolbox-devel-5.2.49-3.1.aarch64.rpm"
RPM_HASH = "2aaa7c234d5e1886dcdc7e4e897743a47e9f7ecb02b82f0f775ef25d89da26ac2bbd573b74a471fef2bb62312ccbb4e8c5b9b851f445e9ec4168de43fe1e84fb"

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

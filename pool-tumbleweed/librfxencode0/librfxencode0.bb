SUMMARY = "Library for the JPEG2000 codec for RDP"
DESCRIPTION = "This package contains libraries for the JPEG2000 codec for RDP."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "librfxencode0-0.9.20-7.3.aarch64.rpm"
RPM_HASH = "30218f51170a29615dac11f05cff6048718613c02262ead1d18333dfe84af694223d8ece830edcef988f78d9ab2b13a010670c19808afa4f0ffc7b1a01c363a4"

RPROVIDES:${PN} += "librfxencode.so.0()(64bit) \
librfxencode0 \
librfxencode0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

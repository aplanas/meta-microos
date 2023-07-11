SUMMARY = "Tools and library for mISDN"
DESCRIPTION = "This package contains libmisdn and some tools to use the mISDN driver. \
mISDN is the new modular ISDN driver for Linux."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.1.0+2.0.22+git6"

RPM_NAME = "mISDNuser-2.1.0+2.0.22+git6-2.7.aarch64.rpm"
RPM_HASH = "608167ac48b3230b8f730707c707ca783e8b83b1e071821836fba354985551f05fc1b3def019101d36e0c7c80057dc6b835ed28dd46ebf16badbdc296b82b982"

RPROVIDES:${PN} += "mISDNuser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcapi20.so.3 \
libmisdn.so.1"

inherit rpm

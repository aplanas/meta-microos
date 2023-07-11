SUMMARY = "C header files for mISDN"
DESCRIPTION = "This package contain the header files and libraries for \
mISDNuser development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.1.0+2.0.22+git6"

RPM_NAME = "mISDNuser-devel-2.1.0+2.0.22+git6-2.7.aarch64.rpm"
RPM_HASH = "353d08fd186b4091fbc5931e2ae5078fbfbfb0cf522996ae6990dacad8c45839ab834d223a7a9a385b561428ddd75472e0d4d0d67fd7bcae8fb8ea649ae3d18b"

RPROVIDES:${PN} += "mISDNuser-devel"

RDEPENDS:${PN} += "libmisdn1"

inherit rpm

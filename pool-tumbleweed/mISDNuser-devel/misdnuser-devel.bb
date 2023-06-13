SUMMARY = "C header files for mISDN"
DESCRIPTION = "This package contain the header files and libraries for \
mISDNuser development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.1.0+2.0.22+git6"

RPM_NAME = "mISDNuser-devel-2.1.0+2.0.22+git6-2.6.aarch64.rpm"
RPM_HASH = "bbd52ac2f2e94c42c7e658d9251c8b9bd8a14ad3ef358b2868d71095acde3d37c5e0d6fbce8fe897a96e2b6751efcc6a32b55a5ee405891c7e340ea3e0d67bff"

RPROVIDES:${PN} += "mISDNuser-devel \
mISDNuser-devel(aarch-64)"

RDEPENDS:${PN} += "libmisdn1"

inherit rpm

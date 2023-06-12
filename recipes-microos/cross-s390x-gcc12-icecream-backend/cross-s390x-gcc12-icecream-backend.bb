SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-s390x-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "111b02d049c10637fb24007163e4d51e27ab6de5bb9b0379fabc4e54233711952f67691eea672c774e00ca117fe4e37f9113f6effa30bd7bca8fb374492eac00"

RPROVIDES:${PN} += "cross-s390x-gcc12-icecream-backend \
cross-s390x-gcc12-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

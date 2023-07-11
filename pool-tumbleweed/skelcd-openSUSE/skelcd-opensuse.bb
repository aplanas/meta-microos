SUMMARY = "Skeleton for openSUSE OSS Media Sets"
DESCRIPTION = "Internal package only, used for openSUSE OSS Media sets"
LICENSE = "MIT"

PV = "84.87.20230502.ce4b10d"

RPM_NAME = "skelcd-openSUSE-84.87.20230502.ce4b10d-1.2.aarch64.rpm"
RPM_HASH = "4860fdd52791665342c326bef07ac32fb09a4a9217ddc0a20ce390c6ff8b628f907b85e4c2adfe028f575524c69b18484ba6e32a57520d019d430f1b06eb0643"

RPROVIDES:${PN} += "skelcd-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm

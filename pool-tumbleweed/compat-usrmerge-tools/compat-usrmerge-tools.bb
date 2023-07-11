SUMMARY = "UsrMerge tools"
DESCRIPTION = "Tools related to UsrMerge to check the state of the system and to \
convert an existing system to UsrMerge."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "compat-usrmerge-tools-84.87-5.16.aarch64.rpm"
RPM_HASH = "577f4ccdac6ab88e93e60ca20808aa46bc4bfe1c86ee1d585caefa3cfac0f07526d0cf2fcd49139b620b44e68f6b9f6e0db5ef43073a2288c9931715f4d7f0c1"

RPROVIDES:${PN} += "compat-usrmerge-tools"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Example scripts for squirrel"
DESCRIPTION = "Example scripts to show squirrel usage."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-examples-3.2-2.2.noarch.rpm"
RPM_HASH = "f988a958a0b4b8083458f3387b2ab71a4f0709e7baf011a6db2951d5334cc9ccb7bd9b220de1a085368a91469853729bfd6a9a28bada760b46cdfbcdd2dadcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "squirrel-examples"

RDEPENDS:${PN} += ""

inherit rpm

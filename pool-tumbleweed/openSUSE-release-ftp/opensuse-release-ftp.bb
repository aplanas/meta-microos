SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-ftp-20230719-1742.1.aarch64.rpm"
RPM_HASH = "0748a65ec4bf6fa69f780a088a8952ed186d2ecc66bee1fe55782dfdb59a5ec49bc764efc25cbfcc6a50ceae6021c5e59f8b1055871fc83d1650b32a16c0e32c"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm

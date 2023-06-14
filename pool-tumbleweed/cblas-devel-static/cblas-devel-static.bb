SUMMARY = "CBLAS - static libraries"
DESCRIPTION = "The cblas-devel-static package contains the CBLAS static libraries \
for -static linking. You do not need these, unless you link \
statically, which is highly discouraged."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "cblas-devel-static-3.9.0-9.1.aarch64.rpm"
RPM_HASH = "14e95e367237261a67a0a518151ae6c0f9e3382c93af1065453f2d5efda01db38a43b07dd804499e683e681734477b26a0920d0db800f159694bc7db97255b2f"

RPROVIDES:${PN} += "cblas-devel-static"

RDEPENDS:${PN} += "cblas-devel"

inherit rpm

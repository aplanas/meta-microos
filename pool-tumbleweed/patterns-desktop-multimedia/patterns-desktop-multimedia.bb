SUMMARY = "Multimedia"
DESCRIPTION = "Multimedia players, sound editing tools, video and image manipulation applications."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-multimedia-20201106-3.5.aarch64.rpm"
RPM_HASH = "e6052ee48178eb036c2b5540ed4fe1b298781f175f313fb0d9cb1a921e13159bd6491aa60bd2120d75d690c998929d9c64152227a5aae76d0d92292789623f61"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-desktop-multimedia \
patterns-openSUSE-multimedia"

RDEPENDS:${PN} += ""

inherit rpm

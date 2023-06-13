SUMMARY = "Replacement game files for Doom game engines"
DESCRIPTION = "Though the Doom engine source code is libre, the original game data \
(graphics, maps, etc.) is not. Freedoom is an alternate game data set \
that can be used with a Doom engine, such as prboom-plus, \
chocolate-doom or gzdoom, to form a free Doom-based game."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "freedoom-0.12.1-1.10.noarch.rpm"
RPM_HASH = "05f49ac6ea8e4e447d60aaac1a3e5b7ff4a8a088c8022ca34178292dd66af849decf2ae5ff60b304147e1c9f5d6b02d0bb4262004a2ae2f02cc5413309dc3f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freedoom"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm

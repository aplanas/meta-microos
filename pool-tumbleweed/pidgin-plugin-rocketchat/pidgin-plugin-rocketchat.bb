SUMMARY = "RocketChat protocol plugin for Pidgin"
DESCRIPTION = "RocketChat protocol plugin for libpurple-based applications. \
 \
This package provides the icon set for Pidgin."
LICENSE = "GPL-2.0-or-later"

PV = "0.0+git20220925"

RPM_NAME = "pidgin-plugin-rocketchat-0.0+git20220925-1.4.noarch.rpm"
RPM_HASH = "6bc778303e555bc3ae004d4f41f9c90f3e6324c6a0d8a08dbb3f4fd171e6d5549367d622eb83d716ef8dc349b8c3291e068e7aed0f0e9a49f831bc262d7e8311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pidgin-plugin-rocketchat"

RDEPENDS:${PN} += "libpurple-plugin-rocketchat"

inherit rpm

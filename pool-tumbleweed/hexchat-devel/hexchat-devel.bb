SUMMARY = "Development Files for HexChat"
DESCRIPTION = "This package includes files needed to develop HexChat modules."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-devel-2.16.1-2.8.aarch64.rpm"
RPM_HASH = "87724f91c9ddca30f093beb08680c918e81e84e3a18b08ce10eaa4083dab386a1f54b9ea73bad81ebdb264bc8d5a5ed9f40922212e9192702dc11b881f89e9a9"

RPROVIDES:${PN} += "hexchat-devel \
pkgconfig-hexchat-plugin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hexchat"

inherit rpm

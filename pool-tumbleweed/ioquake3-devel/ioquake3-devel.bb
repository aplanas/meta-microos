SUMMARY = "Quake III"
DESCRIPTION = "Quake III development tools for creating mods: q3lcc, q3rcc, q3cpp, \
q3asm"
LICENSE = "GPL-2.0-or-later"

PV = "1.36+git.20221123"

RPM_NAME = "ioquake3-devel-1.36+git.20221123-1.3.aarch64.rpm"
RPM_HASH = "2846a853147e2d265e98523367d728b7027ee4729c734602d5e8d77c35b78bf82ee8d10fe9ea541f1130baf34f104d6068741ea81733f7214aeaf85b69ad3027"

RPROVIDES:${PN} += "ioquake3-devel"

RDEPENDS:${PN} += ""

inherit rpm

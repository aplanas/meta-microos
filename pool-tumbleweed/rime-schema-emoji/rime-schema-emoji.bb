SUMMARY = "emoji input schema for rime"
DESCRIPTION = "emoji input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-emoji-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "01b7ea0f97e3d8a8ecbddbc5f2ddb424edf4629a340839954c28cff16f619ab118b963e4413aafb8ef2d04fac1701b4ed7c7b311ee1f9ea2cd2f3a7d71de719f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-emoji"
RDEPENDS:${PN} += ""

inherit rpm

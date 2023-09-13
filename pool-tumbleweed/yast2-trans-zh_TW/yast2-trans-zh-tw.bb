SUMMARY = "YaST2 - Traditional Chinese Translations"
DESCRIPTION = "YaST2 - Translations for Traditional Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-zh_TW-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "17bf93f8b75188ec4384b5322f8a8ebfc8eeb7a111a0c5ec5b26e779678218c9da09c3c43ad1c7957bc31f38ce3b32d47c059e9fef62223bdf83a6a434011c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-TW \
yast2-trans-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Xhosa Translations"
DESCRIPTION = "YaST2 - Translations for Xhosa."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-xh-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "6cfb725b6cae92b6bef08031b6eaafbbfaaac27c6228b1615e50d8fcd4c5d7239abaf32628b7ac23e0c4aaa1a664dabf5fcb8a43e44ed1d8613ac1cc7a91355f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-xh \
yast2-trans-xh"

RDEPENDS:${PN} += ""

inherit rpm

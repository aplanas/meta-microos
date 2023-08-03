SUMMARY = "YaST2 - Traditional Chinese Translations"
DESCRIPTION = "YaST2 - Translations for Traditional Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-zh_TW-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "85807575c3f73429e3e33523aac4b7bc783ee31ef34289f88a8ffbc011c493c98e4d7d7f237f877c818991b0eb9f72135179421bad54c762a7b3585709386796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-TW \
yast2-trans-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm

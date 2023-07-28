SUMMARY = "YaST2 - Tamil Translations"
DESCRIPTION = "YaST2 - Tamil translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ta-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "438d69da2a72f8b7adf01569b217cd5d343e8dbf25083d6e3cceec0ac1ab8ca6600a0c59734d29dd57374e22b3ed20ce9e01ea578d74de2ef9a5ab04bc99ad06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ta \
yast2-trans-ta"

RDEPENDS:${PN} += ""

inherit rpm

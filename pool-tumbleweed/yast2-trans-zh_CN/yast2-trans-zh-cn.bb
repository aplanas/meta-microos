SUMMARY = "YaST2 - Simplified Chinese Translations"
DESCRIPTION = "YaST2 - Simplified Chinese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-zh_CN-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "949d63439fb5935f9d569abd9cacd333afed12989f3b4cc9741168d38b3df22dcd44e054b855b735364c39423bae7c630fc892e8a07df41d0b7147898f27a45e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-CN \
yast2-trans-zh-CN"

RDEPENDS:${PN} += ""

inherit rpm

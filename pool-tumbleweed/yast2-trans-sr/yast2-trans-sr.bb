SUMMARY = "YaST2 - Serbian Translations"
DESCRIPTION = "YaST2 - Translations for Serbian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-sr-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "d01f5ef8702fa5905310e5d09d3cd8874f8d3711de3472eaa020a7218a886e308be0bfc5b63ae94e229cb0d6d9f05f3c4bb92efc1eacbd8e552154ff40e01046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr \
yast2-trans-sr"

RDEPENDS:${PN} += ""

inherit rpm

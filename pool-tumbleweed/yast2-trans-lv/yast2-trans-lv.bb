SUMMARY = "YaST2 - Latvian Translations"
DESCRIPTION = "YaST2 - Translations for Latvian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-lv-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "0f9add454cfcb64301a037d0d77a4db8e58b1801073ff92a123065d472ca364922ade111dbc34701d254aab9b90202369b5ec0f9de18164b9870d83a85b0b7df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lv \
yast2-trans-lv"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Danish Translations"
DESCRIPTION = "YaST2 - Translations for Danish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-da-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "6fd856388231f6817aa078b274cbb01a27b626c48c6da1d9d211c11eb9a9e4db5322cd28cb06949f1cba91fe728d6b6af4088f1d94976bf35b34a2fdd9c7bb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-da \
yast2-trans-da"

RDEPENDS:${PN} += ""

inherit rpm

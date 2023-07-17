SUMMARY = "YaST2 - Albanian Translations"
DESCRIPTION = "YaST2 - Translations for Albanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-sq-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "732b64892a55f1ff8eee8c675ec36bbf8e11a6e833ad9d71abcba8e6e09d9e9a597a20db988938942bb1c6b968dabb2668c522f136978f61e37b912c87dad204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sq \
yast2-trans-sq"

RDEPENDS:${PN} += ""

inherit rpm

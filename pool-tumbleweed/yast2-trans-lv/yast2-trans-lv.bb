SUMMARY = "YaST2 - Latvian Translations"
DESCRIPTION = "YaST2 - Translations for Latvian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-lv-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "32ecdeb081652c8fdba573ee927613c548b80af416f124794b977bcc4779ee643baa751c7d92eb4ba9f8ceed1f936029d7dbf25398d33da9a39c37d294ac7df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lv \
yast2-trans-lv"

RDEPENDS:${PN} += ""

inherit rpm

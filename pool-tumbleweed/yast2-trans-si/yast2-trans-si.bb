SUMMARY = "YaST2 - Sinhala Translations"
DESCRIPTION = "YaST2 - Translations for Sinhala."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-si-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "d1011cc7b2a84b004ad7dd1aa54c59f967a4a3ed86c6d06a59c208fbb88089b65aafc23baa00c397aea11a0bea9f52b5766482afdfe46f346c945ce7c5a2acbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-si \
yast2-trans-si"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Bulgarian Translations"
DESCRIPTION = "YaST2 - Translations for Bulgarian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-bg-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "7d08f8f703efb4242b81be8d1bea3a94e1b54acb7da4088cf1e182ee89ff8e2aac6ae79aea9b61252a65ec166c43eebc9782900aa9d7a5a40e0fe15597fc15e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bg \
yast2-trans-bg"

RDEPENDS:${PN} += ""

inherit rpm

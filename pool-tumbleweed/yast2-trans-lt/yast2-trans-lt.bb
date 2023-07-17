SUMMARY = "YaST2 - Lithuanian Translations"
DESCRIPTION = "YaST2 - Translations for Lithuanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-lt-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "68b57f8a3cde66a0b8d8f84b07f5b338ddb7437e43f70d5e732aef18d80e8474c2ae10c6f80e588914027ad9eb4d5c50e27f51256ede14599c9754ca4906d175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lt \
yast2-trans-lt"

RDEPENDS:${PN} += ""

inherit rpm

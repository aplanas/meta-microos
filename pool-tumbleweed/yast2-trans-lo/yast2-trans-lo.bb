SUMMARY = "YaST2 - Lao Translations"
DESCRIPTION = "YaST2 - Translations for Lao."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-lo-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "4b0350405b76839155bbcc1603f2013378f7b34ccd229b997105091a0315d213a99e72059e4d25685120e515bdef0c7884bbb3862cd5ef24e15cae7073d9b59f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lo \
yast2-trans-lo"

RDEPENDS:${PN} += ""

inherit rpm

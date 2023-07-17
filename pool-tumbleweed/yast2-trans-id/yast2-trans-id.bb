SUMMARY = "YaST2 - Indonesian Translations"
DESCRIPTION = "YaST2 - Indonesian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-id-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "a18979920da6c5c006de5f274cc9a01976c183cf79e9052a16b389440831de066ec9262a0f041386f7601815e02ef6d5fffe45380dc992734be24e967beec520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-id \
yast2-trans-id"

RDEPENDS:${PN} += ""

inherit rpm

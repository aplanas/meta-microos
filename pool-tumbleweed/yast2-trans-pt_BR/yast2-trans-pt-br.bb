SUMMARY = "YaST2 - Brazilian Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Brazilian Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-pt_BR-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "63642a5006ca1d1e95cbffb19faeb26d3da35e63728af496aaf44fd2f9420a3467c09f0e6878c752b8f387ead0c79d1fa570d5f7a17a735b4244b88909272ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt-BR \
yast2-trans-pt-BR"

RDEPENDS:${PN} += ""

inherit rpm

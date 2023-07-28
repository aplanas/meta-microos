SUMMARY = "YaST2 - Russian Translations"
DESCRIPTION = "YaST2 - Translations for Russian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ru-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "9ba68b12f4dc97ab77becbca60efd1d9ad0fc125820fe0972c56497bf0ae0d64e6cd58228474d8201b3fe0b539837f3d549aceccf0dac113cad397f31bbff99c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ru \
yast2-trans-ru"

RDEPENDS:${PN} += ""

inherit rpm

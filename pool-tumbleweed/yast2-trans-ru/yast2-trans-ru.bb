SUMMARY = "YaST2 - Russian Translations"
DESCRIPTION = "YaST2 - Translations for Russian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ru-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "0d425d6b6a03294d5b198690d5fd73c6a09a122cfc887df1ec7fc19b7753cca676f65f22b2369465ae3bea4e3cfb964f1aa22fdf36d0af04052f6a7fc1a028b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ru \
yast2-trans-ru"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Swahili Translations"
DESCRIPTION = "YaST2 - Translations for Swahili."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-sw-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "2a36cbda106ddc56450161baa64d62de1fb51fd0e6878dfcdc1d6b363a8b7ffc89ccaf117eb3ed2f0883edad58bf45302649b78ea3955fb11ce562c47eae11de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sw \
yast2-trans-sw"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Translations for package mathgl"
DESCRIPTION = "Provides translations for the 'mathgl' package."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-lang-8.0.1-4.2.noarch.rpm"
RPM_HASH = "232c45e87d7f2073f50148c93b884bb6cec8a3bc02cf3e5e26740cec5f30b183f7af9a8bc261c65a773663b52239f04916abe7b2857aebb3a881c7e93de5831b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mathgl-es \
locale-mathgl-ru \
mathgl-lang \
mathgl-lang-all"

RDEPENDS:${PN} += "mathgl"

inherit rpm

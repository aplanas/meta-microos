SUMMARY = "Translations for package ddccontrol-db"
DESCRIPTION = "Provides translations for the 'ddccontrol-db' package."
LICENSE = "GPL-2.0-or-later"

PV = "20220903"

RPM_NAME = "ddccontrol-db-lang-20220903-1.2.noarch.rpm"
RPM_HASH = "ad2e868cc04bf18e67825402a437a5e3ca713b559dc320900e1859aea7738e502091a2e91995e2f1ac2cb185377cac0d041c78986d2116f026e66f1f7a181771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddccontrol-db-lang \
ddccontrol-db-lang-all \
locale-ddccontrol-db-es \
locale-ddccontrol-db-fr \
locale-ddccontrol-db-pl \
locale-ddccontrol-db-ru \
locale-ddccontrol-db-zh-CN"

RDEPENDS:${PN} += "ddccontrol-db"

inherit rpm

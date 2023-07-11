SUMMARY = "Translations for package crow-translate"
DESCRIPTION = "Provides translations for the 'crow-translate' package."
LICENSE = "GPL-3.0-only"

PV = "2.10.0"

RPM_NAME = "crow-translate-lang-2.10.0-1.5.noarch.rpm"
RPM_HASH = "b0aac671ab1f45ccb9cd9b90e8003584f37059b1319a8e4041268d5deefbfd334bfe825066f64d7365045406e3cd3bf65d40a59eb1656beecda768906cd05efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crow-translate-lang \
crow-translate-lang-all"

RDEPENDS:${PN} += "crow-translate"

inherit rpm

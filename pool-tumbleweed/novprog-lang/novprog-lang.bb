SUMMARY = "Translations for package novprog"
DESCRIPTION = "Provides translations for the 'novprog' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.0"

RPM_NAME = "novprog-lang-3.2.0-1.8.noarch.rpm"
RPM_HASH = "b3b0b26ce7c2713789bcbd5b9204980af565ba35857a9af85c2aaddfea0e668d065206c85840df3cfc274dd3ad7f93aeda84b42d8ed567e86e964599b8a86299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "novprog-lang \
novprog-lang-all"

RDEPENDS:${PN} += "novprog"

inherit rpm

SUMMARY = "Translations for package novprog"
DESCRIPTION = "Provides translations for the 'novprog' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.2"

RPM_NAME = "novprog-lang-3.2.2-1.1.noarch.rpm"
RPM_HASH = "414d829adc19a7a290a6592375e5c64483d40792fee73f1570db217e16a5a0c2e438896cf7e4fa7fd37fe63cc2956f8f01a687ab702bb76b492a1fadb877b6b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "novprog-lang \
novprog-lang-all"

RDEPENDS:${PN} += "novprog"

inherit rpm

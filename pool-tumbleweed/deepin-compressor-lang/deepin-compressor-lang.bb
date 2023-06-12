SUMMARY = "Translations for package deepin-compressor"
DESCRIPTION = "Provides translations for the 'deepin-compressor' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.12.13"

RPM_NAME = "deepin-compressor-lang-5.12.13-1.3.noarch.rpm"
RPM_HASH = "83d44ddbebeb7fc9112945b3bfba9566171215a61c595469ea15dc062d71a2094c67b744b4afce68f52faa86f79c6feb7c8b73da3b3872621192c373f5932056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-compressor-lang \
deepin-compressor-lang-all"
RDEPENDS:${PN} += "deepin-compressor"

inherit rpm

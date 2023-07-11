SUMMARY = "Akonadi calendar integration"
DESCRIPTION = "This library provides calendar integration for Akonadi based Applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-calendar-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "dc75fa43267da4869cc52e76393cfa357e6a7913e94992946404eae3499444973032725aaf7e3fa60243707f39edb04a87d0b4a7c6e493851185ece22afb51a3"

RPROVIDES:${PN} += "akonadi-calendar"

RDEPENDS:${PN} += ""

inherit rpm

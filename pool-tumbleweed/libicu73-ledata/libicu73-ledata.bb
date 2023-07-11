SUMMARY = "Rule databases and tables for ICU"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
 \
ICU makes use of a wide variety of data tables to provide many of its \
services: converter mapping tables, collation rules, transliteration \
rules, break iterator rules and dictionaries. \
 \
This subpackage contains these data tables, in little-endian format."
LICENSE = "ICU"

PV = "73.2"

RPM_NAME = "libicu73-ledata-73.2-1.1.noarch.rpm"
RPM_HASH = "3f75920505dbf4df2ce0bc58ee7b750670cb5b387d440268b4065a7b69e47bf08504b6f065c60bf0d00afe8172d23478cd96322bfe153fd010cdf37e3a4e6bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu73-ledata"

RDEPENDS:${PN} += ""

inherit rpm

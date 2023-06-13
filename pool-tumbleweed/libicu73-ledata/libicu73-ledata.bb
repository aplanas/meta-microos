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

PV = "73.1"

RPM_NAME = "libicu73-ledata-73.1-1.1.noarch.rpm"
RPM_HASH = "737662e4f68baa4ca56485f12ba0f7b940e8545de1f154d6cc3573d2c398263c6da5aa2303bf62b89abf2550d71a720ff310a3a5ae565aee5c5d2357ba2d41c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu73-ledata"

RDEPENDS:${PN} += ""

inherit rpm

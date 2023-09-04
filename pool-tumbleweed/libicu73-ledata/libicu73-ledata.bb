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

RPM_NAME = "libicu73-ledata-73.2-2.1.noarch.rpm"
RPM_HASH = "5870ae9c00ede4b78ffb8959dda9bb07fe26196a4fab21ef4cddf245a4bfc4cc0116e5bf81396120206c8bb4b9c20de0c69556200db010ff5cd0b3d10b62570a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu73-ledata"

RDEPENDS:${PN} += ""

inherit rpm

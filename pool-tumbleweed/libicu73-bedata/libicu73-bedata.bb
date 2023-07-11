SUMMARY = "Rule databases and tables for ICU"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
 \
ICU makes use of a wide variety of data tables to provide many of its \
services: converter mapping tables, collation rules, transliteration \
rules, break iterator rules and dictionaries. \
 \
This subpackage contains these data tables, in big-endian format."
LICENSE = "ICU"

PV = "73.2"

RPM_NAME = "libicu73-bedata-73.2-1.1.noarch.rpm"
RPM_HASH = "2e8deff56f69f649a551a581a94eadc5bd90624672da7a7996e3b918002de8122119f24e99c07d86964052d93897147e7b2286c8f6e8fb6228ef5fafa79e2313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu73-bedata"

RDEPENDS:${PN} += ""

inherit rpm

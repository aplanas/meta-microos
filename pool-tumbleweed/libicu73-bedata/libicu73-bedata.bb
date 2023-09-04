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

RPM_NAME = "libicu73-bedata-73.2-2.1.noarch.rpm"
RPM_HASH = "1eaa71a8dd87d0228235708afe1d62b97e1fcef15765d1d52f1c6668524170761eb2673d2dba7a1cc1c402715c4307b0610e1d79c17ec390e0efc9635b524bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu73-bedata"

RDEPENDS:${PN} += ""

inherit rpm

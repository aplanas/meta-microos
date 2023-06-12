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

PV = "73.1"

RPM_NAME = "libicu73-bedata-73.1-1.1.noarch.rpm"
RPM_HASH = "b0d0994f11c1158c93477ac76ed4101fdcf21aaa9d3677fffd8599981671f49356850489f319eb6022cee9174eb116a47e05d6ed4f2e0b91e70ad2381e6f2182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu73-bedata"
RDEPENDS:${PN} += ""

inherit rpm

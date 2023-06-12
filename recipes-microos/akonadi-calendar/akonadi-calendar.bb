SUMMARY = "Akonadi calendar integration"
DESCRIPTION = "This library provides calendar integration for Akonadi based Applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-calendar-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "9504d4110e1aca24ab5ddc3514afa08e49408f9ec0240804619532ca40bfa5a8a0e276092fdd41fce6fb33ecdf97d112517bfedae6c213cef9041b66813188d1"

RPROVIDES:${PN} += "akonadi-calendar \
akonadi-calendar(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

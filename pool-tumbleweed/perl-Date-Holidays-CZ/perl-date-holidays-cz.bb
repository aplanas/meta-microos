SUMMARY = "Determine Czech holidays"
DESCRIPTION = "This module exports a single function named *holidays()* which returns a \
list of Czech holidays in a given year."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "perl-Date-Holidays-CZ-0.20-2.12.noarch.rpm"
RPM_HASH = "b81f2791b3512f4036c8e8b48804e6fb6aff3fcfdeebc901efda4b5214452338db791cbff35c57a68af90c451c927b816d31a01795150482a12a2764a9edfe9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Date::Holidays::CZ) \
perl-Date-Holidays-CZ"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Date::Calc)"

inherit rpm

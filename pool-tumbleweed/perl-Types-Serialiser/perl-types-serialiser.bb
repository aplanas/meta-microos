SUMMARY = "Simple data types for common serialisation formats"
DESCRIPTION = "This module provides some extra datatypes that are used by common \
serialisation formats such as JSON or CBOR. The idea is to have a \
repository of simple/small constants and containers that can be shared by \
different implementations so they become interoperable between each other."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Types-Serialiser-1.01-1.11.noarch.rpm"
RPM_HASH = "8fce6f51994a609a4fc3c84f9bb381ce03b52c8eaa3c88cbdd2db9ed7b4d32ac8ee50dd657cbfe1aa7ed21613cc535dc879afc41a8a7adeacd82edfcf4ad8617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--PP--Boolean \
perl-Types--Serialiser \
perl-Types--Serialiser--BooleanBase \
perl-Types--Serialiser--Error \
perl-Types-Serialiser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-common--sense"

inherit rpm

SUMMARY = "Simple data types for common serialisation formats"
DESCRIPTION = "This module provides some extra datatypes that are used by common \
serialisation formats such as JSON or CBOR. The idea is to have a \
repository of simple/small constants and containers that can be shared by \
different implementations so they become interoperable between each other."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Types-Serialiser-1.01-1.13.noarch.rpm"
RPM_HASH = "51ca673b321df2c00ae3abc1395b1d3cfab0af930528573bbcc07c3b498a255e4c43a1caadc20a6dbf3ae353becafa3a2c7ce66909d72ec87d40d2130141da53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--PP--Boolean \
perl-Types--Serialiser \
perl-Types--Serialiser--BooleanBase \
perl-Types--Serialiser--Error \
perl-Types-Serialiser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-common--sense"

inherit rpm

SUMMARY = "Simple data types for common serialisation formats"
DESCRIPTION = "This module provides some extra datatypes that are used by common \
serialisation formats such as JSON or CBOR. The idea is to have a \
repository of simple/small constants and containers that can be shared by \
different implementations so they become interoperable between each other."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Types-Serialiser-1.01-1.12.noarch.rpm"
RPM_HASH = "032706ff012b6e5dc347e693da5481b3acbd9b34a4a77781221d376da8d52d3458e9e215776e0ce5c6f3e15ec9c285d2051962a42d5e4211f1770ce6800582c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--PP--Boolean \
perl-Types--Serialiser \
perl-Types--Serialiser--BooleanBase \
perl-Types--Serialiser--Error \
perl-Types-Serialiser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-common--sense"

inherit rpm

SUMMARY = "Parses ISO8601 formats"
DESCRIPTION = "Parses almost all ISO8601 date and time formats. ISO8601 time-intervals \
will be supported in a later release."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-DateTime-Format-ISO8601-0.16-1.12.noarch.rpm"
RPM_HASH = "5fd5b4147d76aea1cd1baed0352a67b144e7cdb9948d1584ea49b8222b71e4d54d81b26b744b4303ec8c349d9513de10d53484ab4f8e11bcde8d40b1c921c6fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--ISO8601 \
perl-DateTime--Format--ISO8601--Types \
perl-DateTime-Format-ISO8601"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-DateTime--Format--Builder \
perl-Params--ValidationCompiler \
perl-Specio \
perl-Specio--Declare \
perl-Specio--Exporter \
perl-Specio--Library--Builtins \
perl-namespace--autoclean \
perl-parent"

inherit rpm

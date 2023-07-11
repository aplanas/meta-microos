SUMMARY = "Parses ISO8601 formats"
DESCRIPTION = "Parses almost all ISO8601 date and time formats. ISO8601 time-intervals \
will be supported in a later release."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-DateTime-Format-ISO8601-0.16-1.11.noarch.rpm"
RPM_HASH = "37bb8d68151e81024f813eadb68f52a857d7f9c3b7b4ea441bd8a90c8b93f66c0ed0d87750e45656e41e21afe072315c7c1ea773a7b253192835b2992c16dc66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--ISO8601 \
perl-DateTime--Format--ISO8601--Types \
perl-DateTime-Format-ISO8601"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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

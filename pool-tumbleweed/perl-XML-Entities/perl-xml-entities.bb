SUMMARY = "Perl Module to decode Strings with XML Entities"
DESCRIPTION = "This module deals with decoding of strings with XML character entities."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.0002"

RPM_NAME = "perl-XML-Entities-1.0002-1.28.aarch64.rpm"
RPM_HASH = "8869bad925b7970fb1c84f0eb8d7a1a4d9fdba619dd3ef2d62245743c8caeebc86dbadd242b01ba792e760fb1a48b2fea7b1501911aca7060f7154cc336f8c8c"

RPROVIDES:${PN} += "perl-XML--Entities \
perl-XML--Entities--Data \
perl-XML-Entities"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

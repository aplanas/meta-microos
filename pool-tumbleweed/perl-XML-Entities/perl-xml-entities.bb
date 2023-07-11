SUMMARY = "Perl Module to decode Strings with XML Entities"
DESCRIPTION = "This module deals with decoding of strings with XML character entities."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.0002"

RPM_NAME = "perl-XML-Entities-1.0002-1.27.aarch64.rpm"
RPM_HASH = "5236ebc00085c346c2ff4ab5c2eb05890c86eda9ca0ada4aaba768b618db672dde66c415157d7c20aa5fc6ad9e974b0f4f94a57cb1488303f723beb1edf7fe1e"

RPROVIDES:${PN} += "perl-XML--Entities \
perl-XML--Entities--Data \
perl-XML-Entities"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

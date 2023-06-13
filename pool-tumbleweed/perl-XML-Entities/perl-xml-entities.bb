SUMMARY = "Perl Module to decode Strings with XML Entities"
DESCRIPTION = "This module deals with decoding of strings with XML character entities."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.0002"

RPM_NAME = "perl-XML-Entities-1.0002-1.26.aarch64.rpm"
RPM_HASH = "b6a087c627aa00033fd9ccafed57071fcb594c5f8df4bef60aee20cc741dab67703479980a5ca40684d060e6041d1a4f2a729980d63fcc32bb909e73fb152578"

RPROVIDES:${PN} += "perl(XML::Entities) \
perl(XML::Entities::Data) \
perl-XML-Entities \
perl-XML-Entities(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

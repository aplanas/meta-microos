SUMMARY = "A Perl only implementation of a RPM header reader"
DESCRIPTION = "RPM::Header::PurePerl is a clone of RPM::Header written in only Perl, so it \
provides a way to read an rpm package on systems where rpm is not installed. \
RPM::Header::PurePerl can be used as a drop in replacement for RPM::Header, \
if needed also the other way round."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.0.2"

RPM_NAME = "perl-RPM-Header-PurePerl-1.0.2-1.26.aarch64.rpm"
RPM_HASH = "ba1a75de703c8f7190195f52e817a0f650569fb0aaf8e1da82d588146b53f48097bd1164aa0a9bbd59ad3f9e81e239363160565dced797ded5f71f68f9116412"

RPROVIDES:${PN} += "perl-RPM--Header--PurePerl \
perl-RPM--Header--PurePerl--Tagtable \
perl-RPM-Header-PurePerl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

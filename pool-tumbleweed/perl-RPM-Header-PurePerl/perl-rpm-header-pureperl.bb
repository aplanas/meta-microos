SUMMARY = "A Perl only implementation of a RPM header reader"
DESCRIPTION = "RPM::Header::PurePerl is a clone of RPM::Header written in only Perl, so it \
provides a way to read an rpm package on systems where rpm is not installed. \
RPM::Header::PurePerl can be used as a drop in replacement for RPM::Header, \
if needed also the other way round."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.0.2"

RPM_NAME = "perl-RPM-Header-PurePerl-1.0.2-1.24.aarch64.rpm"
RPM_HASH = "49bdfbf7e9cc2c0c7163738c461974b3ae63e98766a3af44ae93e7f68e0d9fd958f07d3b06c21901b86d82ba0b149432a115fae7c5b4fdc12f561c5277bb0d5a"

RPROVIDES:${PN} += "perl(RPM::Header::PurePerl) \
perl(RPM::Header::PurePerl::Tagtable) \
perl-RPM-Header-PurePerl \
perl-RPM-Header-PurePerl(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

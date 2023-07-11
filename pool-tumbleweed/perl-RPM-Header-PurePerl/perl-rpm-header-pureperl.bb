SUMMARY = "A Perl only implementation of a RPM header reader"
DESCRIPTION = "RPM::Header::PurePerl is a clone of RPM::Header written in only Perl, so it \
provides a way to read an rpm package on systems where rpm is not installed. \
RPM::Header::PurePerl can be used as a drop in replacement for RPM::Header, \
if needed also the other way round."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.0.2"

RPM_NAME = "perl-RPM-Header-PurePerl-1.0.2-1.25.aarch64.rpm"
RPM_HASH = "f38b9c47cb247244f30e84ccbe01c9a9dfe51e0a6068ef0dae3bc9cdf0e15de366c63606db582575216293a959c2f6333b15d99f9a8c9f9cde9900f0690f1dc3"

RPROVIDES:${PN} += "perl-RPM--Header--PurePerl \
perl-RPM--Header--PurePerl--Tagtable \
perl-RPM-Header-PurePerl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

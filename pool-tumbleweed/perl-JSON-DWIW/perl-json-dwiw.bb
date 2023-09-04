SUMMARY = "JSON converter that Does What I Want"
DESCRIPTION = "Other JSON modules require setting several parameters before calling the \
conversion methods to do what I want. This module does things by default \
that I think should be done when working with JSON in Perl. This module \
also encodes and decodes faster than the JSON manpage.pm and the JSON::Syck \
manpage in my benchmarks. \
 \
This means that any piece of data in Perl (assuming it's valid unicode) \
will get converted to something in JSON instead of throwing an exception. \
It also means that output will be strict JSON, while accepted input will be \
flexible, without having to set any options. \
 \
For a list of changes in recent versions, see the documentation for the \
JSON::DWIW::Changes manpage. \
 \
This module can be downloaded from the \
http://www.cpan.org/authors/id/D/DO/DOWENS/ manpage."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.47"

RPM_NAME = "perl-JSON-DWIW-0.47-13.39.aarch64.rpm"
RPM_HASH = "a569cb2726ea8134644ee7e5c4a3ccfa0567d19bd5586353fa568132a1123843e0691ecff216529715bebb901e3678a8bb8eace45f91478f4a4068f0b373caa4"

RPROVIDES:${PN} += "perl-JSON--DWIW \
perl-JSON--DWIW--Boolean \
perl-JSON--DWIW--Exporter \
perl-JSON-DWIW"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

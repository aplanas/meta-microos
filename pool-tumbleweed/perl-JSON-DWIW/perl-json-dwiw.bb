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

RPM_NAME = "perl-JSON-DWIW-0.47-13.37.aarch64.rpm"
RPM_HASH = "6b4f23f39b47b588f9adaa60258fd7859e89f385009121ec09ada223ac64e76cc8c00629b9d00c21a2a0e34907f873dff617a7586674d91ac3e0fe3fc0aca4ec"

RPROVIDES:${PN} += "perl(JSON::DWIW) \
perl(JSON::DWIW::Boolean) \
perl(JSON::DWIW::Exporter) \
perl-JSON-DWIW \
perl-JSON-DWIW(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

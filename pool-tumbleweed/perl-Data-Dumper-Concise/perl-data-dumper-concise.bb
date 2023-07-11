SUMMARY = "Less indentation and newlines plus sub deparsing"
DESCRIPTION = "This module always exports a single function, Dumper, which can be called \
with an array of values to dump those values. \
 \
It exists, fundamentally, as a convenient way to reproduce a set of Dumper \
options that we've found ourselves using across large numbers of \
applications, primarily for debugging output. \
 \
The principle guiding theme is 'all the concision you can get while still \
having a useful dump and not doing anything cleverer than setting \
Data::Dumper options' - it's been pointed out to us that \
Data::Dump::Streamer can produce shorter output with less lines of code. We \
know. This is simpler and we've never seen it segfault. But for \
complex/weird structures, it generally rocks. You should use it as well, \
when Concise is underkill. We do. \
 \
Why is deparsing on when the aim is concision? Because you often want to \
know what subroutine refs you have when debugging and because if you were \
planning to eval this back in you probably wanted to remove subrefs first \
and add them back in a custom way anyway. Note that this -does- force using \
the pure perl Dumper rather than the XS one, but I've never in my life seen \
Data::Dumper show up in a profile so 'who cares?'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.023"

RPM_NAME = "perl-Data-Dumper-Concise-2.023-1.23.noarch.rpm"
RPM_HASH = "a6957a5c827b5fb3d84a5655c0ade0148afb57ab0f500be6bcf01d9ce0bb304515b58e0eb0450f4fe4a0fe3610913c0f4a7e9377c525d8bafd4f214616a30f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Dumper--Concise \
perl-Data--Dumper--Concise--Sugar \
perl-Data-Dumper-Concise \
perl-Devel--Dwarn"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

SUMMARY = "JSON serialising/deserialising, done correctly and fast"
DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its \
primary goal is to be _correct_ and its secondary goal is to be _fast_. To \
reach the latter goal it was written in C. \
 \
See MAPPING, below, on how JSON::XS maps perl values to JSON values and \
vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.03"

RPM_NAME = "perl-JSON-XS-4.03-1.17.aarch64.rpm"
RPM_HASH = "401e8e6dc52a17076fdabbfc140d132fec3590de58405de681363f14c5adf001a2e66a43f54e90c60b05bb842c07c71739a774c3b1e6508d3de646f850bea451"

RPROVIDES:${PN} += "perl-JSON--XS \
perl-JSON-XS"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Types--Serialiser \
perl-common--sense"

inherit rpm

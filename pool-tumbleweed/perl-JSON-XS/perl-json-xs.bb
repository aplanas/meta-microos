SUMMARY = "JSON serialising/deserialising, done correctly and fast"
DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its \
primary goal is to be _correct_ and its secondary goal is to be _fast_. To \
reach the latter goal it was written in C. \
 \
See MAPPING, below, on how JSON::XS maps perl values to JSON values and \
vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.03"

RPM_NAME = "perl-JSON-XS-4.03-1.16.aarch64.rpm"
RPM_HASH = "5e66981db05bc3f6e638464b57716e63e6aab7173b592a45cd71ef20a665e7abb0290b797b9eede413ab2ed85cfe90ed756938cac0c767924e933302781b61bc"

RPROVIDES:${PN} += "perl-JSON--XS \
perl-JSON-XS"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Types--Serialiser \
perl-common--sense"

inherit rpm

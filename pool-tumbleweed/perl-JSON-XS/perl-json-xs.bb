SUMMARY = "JSON serialising/deserialising, done correctly and fast"
DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its \
primary goal is to be _correct_ and its secondary goal is to be _fast_. To \
reach the latter goal it was written in C. \
 \
See MAPPING, below, on how JSON::XS maps perl values to JSON values and \
vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.03"

RPM_NAME = "perl-JSON-XS-4.03-1.15.aarch64.rpm"
RPM_HASH = "6cb5375edeea99053f5f4c9f08342fef9e42de1e19a4d57922fb59e087c02e9f18c79bd526eb2b975b0f732c08af3aa442ec4ef9c3bf72d50a6c12bfdceca3b3"

RPROVIDES:${PN} += "perl(JSON::XS) \
perl-JSON-XS \
perl-JSON-XS(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Types::Serialiser) \
perl(common::sense)"

inherit rpm

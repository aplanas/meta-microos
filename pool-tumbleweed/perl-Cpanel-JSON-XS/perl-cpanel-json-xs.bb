SUMMARY = "CPanel fork of JSON::XS, fast and correct serializing"
DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its \
primary goal is to be _correct_ and its secondary goal is to be _fast_. To \
reach the latter goal it was written in C. \
 \
As this is the n-th-something JSON module on CPAN, what was the reason to \
write yet another JSON module? While it seems there are many JSON modules, \
none of them correctly handle all corner cases, and in most cases their \
maintainers are unresponsive, gone missing, or not listening to bug reports \
for other reasons. \
 \
See below for the cPanel fork. \
 \
See MAPPING, below, on how Cpanel::JSON::XS maps perl values to JSON values \
and vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.36"

RPM_NAME = "perl-Cpanel-JSON-XS-4.36-1.3.aarch64.rpm"
RPM_HASH = "3e7aaaca12d9c321454075ef6509d5fa5841541bc3a59269221a8bd8860eae378c5e65010af98a93d4954471bd9807b0e3f1fec709297dd7faea523dc8664a05"

RPROVIDES:${PN} += "perl(Cpanel::JSON::XS) \
perl(Cpanel::JSON::XS::Type) \
perl-Cpanel-JSON-XS \
perl-Cpanel-JSON-XS(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

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

PV = "4.37"

RPM_NAME = "perl-Cpanel-JSON-XS-4.37-1.1.aarch64.rpm"
RPM_HASH = "99424f6569ba2c302b91404db9a62d415fb9b9cce1c3fa1874dc1724e57b8e2a66771f6bad0949cc2500a0ee819954a5a3e3aa52fe4be60f8c4965b9c470b5f1"

RPROVIDES:${PN} += "perl-Cpanel--JSON--XS \
perl-Cpanel--JSON--XS--Type \
perl-Cpanel-JSON-XS"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

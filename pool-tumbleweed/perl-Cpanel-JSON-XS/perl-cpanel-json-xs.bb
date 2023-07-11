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

RPM_NAME = "perl-Cpanel-JSON-XS-4.36-1.4.aarch64.rpm"
RPM_HASH = "fa83cfdf463228f5808d4b32dc08c13b57806893afa5579dd1fb7fdef06bf23f9d3fe998091b4658a9759011749b30b8eb847978b90639aa44c82518585fa915"

RPROVIDES:${PN} += "perl-Cpanel--JSON--XS \
perl-Cpanel--JSON--XS--Type \
perl-Cpanel-JSON-XS"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

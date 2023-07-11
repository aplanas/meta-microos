SUMMARY = "DelimMatch for Locating Delimited Substrings with Proper Nesting"
DESCRIPTION = "DelimMatch is a Perl 5 module that provides functions for locating \
delimited substrings with proper nesting."
LICENSE = "Artistic-1.0"

PV = "1.06"

RPM_NAME = "perl-Text-DelimMatch-1.06-10.30.aarch64.rpm"
RPM_HASH = "a3a6ddd9f1a1926d6ef242ac6b1da6c002e7129925fdee4eeb69a01ac954a8d43faad7008a215cab26801e90ca5c94c324a3b786d368e5cf83ac55ffb5181946"

RPROVIDES:${PN} += "perl-Text--DelimMatch \
perl-Text-DelimMatch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

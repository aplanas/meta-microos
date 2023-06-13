SUMMARY = "DelimMatch for Locating Delimited Substrings with Proper Nesting"
DESCRIPTION = "DelimMatch is a Perl 5 module that provides functions for locating \
delimited substrings with proper nesting."
LICENSE = "Artistic-1.0"

PV = "1.06"

RPM_NAME = "perl-Text-DelimMatch-1.06-10.29.aarch64.rpm"
RPM_HASH = "4d27a83b9b858200a75359eeaf5448624597d67bc4dfaf2d6e49a9072b9c3bedc6a71ab43b67afb5af7c42cccaa280ef6f37d9863c62e402d6504262d3a5948b"

RPROVIDES:${PN} += "perl(Text::DelimMatch) \
perl-Text-DelimMatch \
perl-Text-DelimMatch(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

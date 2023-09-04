SUMMARY = "DelimMatch for Locating Delimited Substrings with Proper Nesting"
DESCRIPTION = "DelimMatch is a Perl 5 module that provides functions for locating \
delimited substrings with proper nesting."
LICENSE = "Artistic-1.0"

PV = "1.06"

RPM_NAME = "perl-Text-DelimMatch-1.06-10.31.aarch64.rpm"
RPM_HASH = "27d4558a03d2aaac79d14416a007158e65006122ad7259414a963f84cecaffbec18588e5cf4dba878a08b2ed8c8e16f45e6c6bd3e6ccd95f18c966d79a4866a0"

RPROVIDES:${PN} += "perl-Text--DelimMatch \
perl-Text-DelimMatch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

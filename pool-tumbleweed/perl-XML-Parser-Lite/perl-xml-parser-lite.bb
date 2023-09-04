SUMMARY = "Lightweight pure-perl XML Parser (based on regexps)"
DESCRIPTION = "This module implements an XML parser with a interface similar to \
XML::Parser. Though not all callbacks are supported, you should be able to \
use it in the same way you use XML::Parser. Due to using experimental \
regexp features it'll work only on Perl 5.6 and above and may behave \
differently on different platforms. \
 \
Note that you cannot use regular expressions or split in callbacks. This is \
due to a limitation of perl's regular expression implementation (which is \
not re-entrant)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.722"

RPM_NAME = "perl-XML-Parser-Lite-0.722-1.18.noarch.rpm"
RPM_HASH = "1babd7d5ddbdeb47967d83c5a56ac215c9959d2c3b59b657470ae6698043c9e7b436e7cfeb4e91fd7b2d54377ed398b0d6bebc3effed6e614e946f2ccef59bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Parser--Lite \
perl-XML-Parser-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

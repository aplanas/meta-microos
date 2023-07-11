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

RPM_NAME = "perl-XML-Parser-Lite-0.722-1.17.noarch.rpm"
RPM_HASH = "09c0b5275e6da5dadeaf77cd2f9b0a2e798189518d88688d3243ec58d13e1eb9a3e54f406dd7a4132f0d35da8b2402db070a696f1075e9b84d820f47b7771998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Parser--Lite \
perl-XML-Parser-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

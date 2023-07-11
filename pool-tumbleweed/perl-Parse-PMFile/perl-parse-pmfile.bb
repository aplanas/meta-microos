SUMMARY = "Parses .pm file as PAUSE does"
DESCRIPTION = "The most of the code of this module is taken from the PAUSE code as of \
April 2013 almost verbatim. Thus, the heart of this module should be quite \
stable. However, I made it not to use pipe ('-|') as well as I stripped \
database-related code. If you encounter any issue, that's most probably \
because of my modification. \
 \
This module doesn't provide features to extract a distribution or parse \
meta files intentionally."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.44"

RPM_NAME = "perl-Parse-PMFile-0.44-1.2.noarch.rpm"
RPM_HASH = "02c8746667fa854b8d4cce3bfea99455d441c74b6820838768cb5423766eff6dcfefe990cc507423c9a15fa4441b4d6963ec56ecb77c5902a85849b1df324a9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--PMFile \
perl-Parse-PMFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-JSON--PP \
perl-version"

inherit rpm

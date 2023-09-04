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

RPM_NAME = "perl-Parse-PMFile-0.44-1.3.noarch.rpm"
RPM_HASH = "eff056e058aa72e0afe38872f51cb9de774a6dc66d854337837d94d46e46a94451107b13c4684a628f847a05480a592e4ab6a93cf19cfb2c196ef67d4c89a151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--PMFile \
perl-Parse-PMFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-JSON--PP \
perl-version"

inherit rpm

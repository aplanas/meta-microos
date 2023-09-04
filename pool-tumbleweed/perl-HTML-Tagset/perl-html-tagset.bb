SUMMARY = "Data tables useful in parsing HTML"
DESCRIPTION = "This module contains several data tables useful in various kinds of HTML \
parsing operations. \
 \
Note that all tag names used are lowercase. \
 \
In the following documentation, a 'hashset' is a hash being used as a set \
-- the hash conveys that its keys are there, and the actual values \
associated with the keys are not significant. (But what values are there, \
are always true.)"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "3.20"

RPM_NAME = "perl-HTML-Tagset-3.20-73.28.noarch.rpm"
RPM_HASH = "4dc91e4d15630c20cba3a515f76a5b0d5e9667defbc4cd246357b7a868ed9b7f6e0cc9015a376d98ad6b67a1a57ccf68f1c1473823bf437ebdb84a8ca09070d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Tagset \
perl-HTML-Tagset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

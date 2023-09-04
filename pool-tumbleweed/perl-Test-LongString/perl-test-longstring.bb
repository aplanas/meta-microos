SUMMARY = "tests strings for equality, with more helpful failures"
DESCRIPTION = "This module provides some drop-in replacements for the string comparison \
functions of the Test::More manpage, but which are more suitable when you \
test against long strings. If you've ever had to search for text in a \
multi-line string like an HTML document, or find specific items in binary \
data, this is the module for you."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Test-LongString-0.17-1.28.noarch.rpm"
RPM_HASH = "622212614a7bce31c6908ce381835194e093c2e16a7f85b009656df4d13594fdfa147fc78c1315429514157625cd0030a173a1643ed14a47b49d5797671a6b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--LongString \
perl-Test-LongString"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--Builder--Tester"

inherit rpm

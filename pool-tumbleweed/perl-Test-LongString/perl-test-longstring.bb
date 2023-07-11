SUMMARY = "tests strings for equality, with more helpful failures"
DESCRIPTION = "This module provides some drop-in replacements for the string comparison \
functions of the Test::More manpage, but which are more suitable when you \
test against long strings. If you've ever had to search for text in a \
multi-line string like an HTML document, or find specific items in binary \
data, this is the module for you."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Test-LongString-0.17-1.27.noarch.rpm"
RPM_HASH = "ec9aa245a1af4df0348958ab68f1a17dd303c3aa32a53409b0c4d8a5bdb932c66753498851d865c0b26bfdb0c021c61826df1a06821e3bfec000dcbd81005b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--LongString \
perl-Test-LongString"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--Builder--Tester"

inherit rpm

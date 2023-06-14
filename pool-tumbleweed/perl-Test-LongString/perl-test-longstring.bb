SUMMARY = "tests strings for equality, with more helpful failures"
DESCRIPTION = "This module provides some drop-in replacements for the string comparison \
functions of the Test::More manpage, but which are more suitable when you \
test against long strings. If you've ever had to search for text in a \
multi-line string like an HTML document, or find specific items in binary \
data, this is the module for you."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Test-LongString-0.17-1.26.noarch.rpm"
RPM_HASH = "2ec45d7241a581febcdc61af008f2dc9c631f5cc8fbf80608c983778627154905a9a7fbbfc88bacbda8445f2a85a7d531a86858112224dd6fb772a53809229d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--LongString \
perl-Test-LongString"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Test--Builder--Tester"

inherit rpm

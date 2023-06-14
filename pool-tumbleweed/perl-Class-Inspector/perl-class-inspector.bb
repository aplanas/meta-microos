SUMMARY = "Get information about a class and its structure"
DESCRIPTION = "Class::Inspector allows you to get information about a loaded class. Most \
or all of this information can be found in other ways, but they aren't \
always very friendly, and usually involve a relatively high level of Perl \
wizardry, or strange and unusual looking code. Class::Inspector attempts to \
provide an easier, more friendly interface to this information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.36"

RPM_NAME = "perl-Class-Inspector-1.36-1.15.noarch.rpm"
RPM_HASH = "9fbeda54f07cf9204b4a8dc47e44f3ff4ed303b6c97672801343561749a67060dfd3212fc6204106c15ec32338ebe24ac7483c1497e431ff838f1ef614f6897a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Inspector \
perl-Class--Inspector--Functions \
perl-Class-Inspector"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm

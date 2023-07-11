SUMMARY = "Porters stemming algorithm for norwegian."
DESCRIPTION = "Porters stemming algorithm for norwegian."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.2"

RPM_NAME = "perl-Snowball-Norwegian-1.2-14.26.noarch.rpm"
RPM_HASH = "b007b77811cea129426aa1cb1ededf2f95482a56be28e879d7cbfe72c08141068863d34f73f511d43d16d7f9dab212393c5c36c69d28581a42037327d6b50860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball--No \
perl-Snowball-Norwegian"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

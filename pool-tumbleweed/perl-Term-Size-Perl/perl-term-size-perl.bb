SUMMARY = "Perl extension for retrieving terminal size (Perl version)"
DESCRIPTION = "Yet another implementation of 'Term::Size'. Now in pure Perl, with the \
exception of a C probe run on build time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.031"

RPM_NAME = "perl-Term-Size-Perl-0.031-2.9.noarch.rpm"
RPM_HASH = "edbd37150a3f8a6d9e35655a108bb69a81e90f616b3fffc4102466c157aff774799e86bd0fe065f93018fa4b083e8eb87dad36e866252087ea6a14ea86faaca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Size--Perl \
perl-Term--Size--Perl--Params \
perl-Term-Size-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm

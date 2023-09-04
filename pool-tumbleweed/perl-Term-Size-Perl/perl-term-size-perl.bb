SUMMARY = "Perl extension for retrieving terminal size (Perl version)"
DESCRIPTION = "Yet another implementation of 'Term::Size'. Now in pure Perl, with the \
exception of a C probe run on build time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.031"

RPM_NAME = "perl-Term-Size-Perl-0.031-2.11.noarch.rpm"
RPM_HASH = "aadc0a6e7322750b10e5b412b179d18364fb00471e13b20cbffe4824e86d6c703ecd4cca6e20ef924900cf1b8cf817209a98bd69c3aee7f2a5339c061308ab7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Size--Perl \
perl-Term--Size--Perl--Params \
perl-Term-Size-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

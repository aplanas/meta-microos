SUMMARY = "Perl extension for retrieving terminal size (Perl version)"
DESCRIPTION = "Yet another implementation of 'Term::Size'. Now in pure Perl, with the \
exception of a C probe run on build time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.031"

RPM_NAME = "perl-Term-Size-Perl-0.031-2.10.noarch.rpm"
RPM_HASH = "ad4d9cfa94dc3e2f79a411779049b51f97bf04162d6d9c313d11f006bc4d81c170584aa05c4c3e976a8b055cfec00bc7a9a554fe007969ed9c461a5e88670c54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Size--Perl \
perl-Term--Size--Perl--Params \
perl-Term-Size-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

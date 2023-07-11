SUMMARY = "Moose types that check against Perl syntax"
DESCRIPTION = "This library provides Moose types for checking things (mostly strings) \
against syntax that is, or is a reasonable subset of, Perl syntax."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.101344"

RPM_NAME = "perl-MooseX-Types-Perl-0.101344-1.3.noarch.rpm"
RPM_HASH = "1998f475804ac17b2c472a558172fd3a3b95c9bb675e7272f9ebe4e0319abbce815f430d928112f123582fff0bcac9fe9fc4a48b14ea95781152556a051db723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Perl \
perl-MooseX-Types-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Params--Util \
perl-version"

inherit rpm

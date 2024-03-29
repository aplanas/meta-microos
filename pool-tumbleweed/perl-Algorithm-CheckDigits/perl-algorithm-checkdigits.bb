SUMMARY = "Perl extension to generate and test check digits"
DESCRIPTION = "Perl extension to generate and test check digits"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.3.6"

RPM_NAME = "perl-Algorithm-CheckDigits-1.3.6-1.10.noarch.rpm"
RPM_HASH = "4c55152e4743e0e3ff0c738f0dc1643d20b7bd4b439d35140d0b9f013479942fda88880934a642879549653eb02dbc834beb9468087983fba8f80cd54a50fb80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--CheckDigits \
perl-Algorithm--CheckDigits--M07-001 \
perl-Algorithm--CheckDigits--M09-001 \
perl-Algorithm--CheckDigits--M10-001 \
perl-Algorithm--CheckDigits--M10-002 \
perl-Algorithm--CheckDigits--M10-003 \
perl-Algorithm--CheckDigits--M10-004 \
perl-Algorithm--CheckDigits--M10-005 \
perl-Algorithm--CheckDigits--M10-006 \
perl-Algorithm--CheckDigits--M10-008 \
perl-Algorithm--CheckDigits--M10-009 \
perl-Algorithm--CheckDigits--M10-010 \
perl-Algorithm--CheckDigits--M10-011 \
perl-Algorithm--CheckDigits--M11-001 \
perl-Algorithm--CheckDigits--M11-002 \
perl-Algorithm--CheckDigits--M11-003 \
perl-Algorithm--CheckDigits--M11-004 \
perl-Algorithm--CheckDigits--M11-006 \
perl-Algorithm--CheckDigits--M11-007 \
perl-Algorithm--CheckDigits--M11-008 \
perl-Algorithm--CheckDigits--M11-009 \
perl-Algorithm--CheckDigits--M11-010 \
perl-Algorithm--CheckDigits--M11-011 \
perl-Algorithm--CheckDigits--M11-012 \
perl-Algorithm--CheckDigits--M11-013 \
perl-Algorithm--CheckDigits--M11-015 \
perl-Algorithm--CheckDigits--M11-016 \
perl-Algorithm--CheckDigits--M11-017 \
perl-Algorithm--CheckDigits--M16-001 \
perl-Algorithm--CheckDigits--M23-001 \
perl-Algorithm--CheckDigits--M23-002 \
perl-Algorithm--CheckDigits--M43-001 \
perl-Algorithm--CheckDigits--M89-001 \
perl-Algorithm--CheckDigits--M97-001 \
perl-Algorithm--CheckDigits--M97-002 \
perl-Algorithm--CheckDigits--MBase-001 \
perl-Algorithm--CheckDigits--MBase-002 \
perl-Algorithm--CheckDigits--MBase-003 \
perl-Algorithm--CheckDigits--MXX-001 \
perl-Algorithm--CheckDigits--MXX-002 \
perl-Algorithm--CheckDigits--MXX-003 \
perl-Algorithm--CheckDigits--MXX-004 \
perl-Algorithm--CheckDigits--MXX-005 \
perl-Algorithm--CheckDigits--MXX-006 \
perl-Algorithm-CheckDigits"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-version"

inherit rpm

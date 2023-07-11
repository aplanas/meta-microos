SUMMARY = "Dynamic generation of tests in nested combinations of contexts"
DESCRIPTION = "Test::WriteVariants is a utility to create variants of a common test. \
 \
Given the situation - like in DBI where some tests are the same for \
DBI::SQL::Nano and it's drop-in replacement SQL::Statement. Or a \
distribution duo having a Pure-Perl and an XS variant - and the same test \
shall be used to ensure XS and PP version are really drop-in replacements \
for each other."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.014"

RPM_NAME = "perl-Test-WriteVariants-0.014-1.18.noarch.rpm"
RPM_HASH = "53ff77066b2736a9790b158f6002ad11512a6798ade4d4359c5674815d55c85b26695748af452dd665c62bbf0cdaec68bcd56efa5abcd2b2f4bd0c476462fffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--WriteVariants \
perl-Test--WriteVariants--Context \
perl-Test--WriteVariants--Context--BaseItem \
perl-Test--WriteVariants--Context--EnvVar \
perl-Test--WriteVariants--Context--MetaInfo \
perl-Test--WriteVariants--Context--ModuleUse \
perl-Test--WriteVariants--Context--OurVar \
perl-Test-WriteVariants"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--Tumbler \
perl-Module--Pluggable--Object \
perl-Module--Runtime"

inherit rpm

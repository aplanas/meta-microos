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

RPM_NAME = "perl-Test-WriteVariants-0.014-1.19.noarch.rpm"
RPM_HASH = "4c638b6d8fb9f37dcd6308478d59fd45859749132213a1fbec75ac734cb341dad13fbf85dd6f3fc0a522bf4e78f5b87dbf4dc88dfd82793b6f6705070ab5f10e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--WriteVariants \
perl-Test--WriteVariants--Context \
perl-Test--WriteVariants--Context--BaseItem \
perl-Test--WriteVariants--Context--EnvVar \
perl-Test--WriteVariants--Context--MetaInfo \
perl-Test--WriteVariants--Context--ModuleUse \
perl-Test--WriteVariants--Context--OurVar \
perl-Test-WriteVariants"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Tumbler \
perl-Module--Pluggable--Object \
perl-Module--Runtime"

inherit rpm

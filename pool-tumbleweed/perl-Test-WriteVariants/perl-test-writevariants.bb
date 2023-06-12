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

RPM_NAME = "perl-Test-WriteVariants-0.014-1.17.noarch.rpm"
RPM_HASH = "9741ab9de50b38967f2504314c9c013374c04ef63ee7597c58b1a06d2ba30794b45462f50e4b845c00a931d122fba1e969addd1923516ae38b4f3057d173d230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::WriteVariants) \
perl(Test::WriteVariants::Context) \
perl(Test::WriteVariants::Context::BaseItem) \
perl(Test::WriteVariants::Context::EnvVar) \
perl(Test::WriteVariants::Context::MetaInfo) \
perl(Test::WriteVariants::Context::ModuleUse) \
perl(Test::WriteVariants::Context::OurVar) \
perl-Test-WriteVariants"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Data::Tumbler) \
perl(Module::Pluggable::Object) \
perl(Module::Runtime)"

inherit rpm

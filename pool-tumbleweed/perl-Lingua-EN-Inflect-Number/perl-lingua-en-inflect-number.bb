SUMMARY = "Force number of words to singular or plural"
DESCRIPTION = "This module extends the functionality of Lingua::EN::Inflect with three new \
functions available for export:"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.12"

RPM_NAME = "perl-Lingua-EN-Inflect-Number-1.12-1.26.noarch.rpm"
RPM_HASH = "2c4faff3cfbf1f66d16f018420f98292533e284706edc83bd52b95be80e91fb478cd754b7eb6fadf11ff3bdd4908fe7874378fb289e85a8882557834a663bac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::EN::Inflect::Number) \
perl-Lingua-EN-Inflect-Number"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Lingua::EN::Inflect)"

inherit rpm

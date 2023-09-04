SUMMARY = "Identify the Dependencies of a Distribution"
DESCRIPTION = "Module::Depends extracts module dependencies from an unpacked distribution \
tree. \
 \
Module::Depends only evaluates the META.yml shipped with a distribution. \
This won't be effective until all distributions ship META.yml files, so we \
suggest you take your life in your hands and look at \
Module::Depends::Intrusive."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.16"

RPM_NAME = "perl-Module-Depends-0.16-6.21.noarch.rpm"
RPM_HASH = "8c651f977517dde9934d6583e03a1ecf835ff52bbd4f7e607c0c1a95f84dddc9b89a5419b8050bc5e6467a47446f572037d9244777d568b0095c44a8b58887a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Depends \
perl-Module--Depends--Intrusive \
perl-Module--Depends--Intrusive--Fake--Module--Build \
perl-Module-Depends"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor--Chained \
perl-Parse--CPAN--Meta"

inherit rpm

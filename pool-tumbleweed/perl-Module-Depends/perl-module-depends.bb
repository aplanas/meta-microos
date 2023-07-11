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

RPM_NAME = "perl-Module-Depends-0.16-6.20.noarch.rpm"
RPM_HASH = "b3d79a1b645a75319aac49957ba592dd8275d551fbcd34ef519afccaf65360c4698d74076dc85dd1514b620013c39fb76e8f467c232701e40c0fa5e86bab0c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Depends \
perl-Module--Depends--Intrusive \
perl-Module--Depends--Intrusive--Fake--Module--Build \
perl-Module-Depends"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor--Chained \
perl-Parse--CPAN--Meta"

inherit rpm

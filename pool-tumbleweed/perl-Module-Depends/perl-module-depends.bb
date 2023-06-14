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

RPM_NAME = "perl-Module-Depends-0.16-6.19.noarch.rpm"
RPM_HASH = "ff4d2a16c3820db4d29a4c8270e0974101703c35ac893e43ecb4d550b9e15ff8e9f0a290945bded89d8c7dd104b699019d96acdb06a218444a84bd6a324b65a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Depends \
perl-Module--Depends--Intrusive \
perl-Module--Depends--Intrusive--Fake--Module--Build \
perl-Module-Depends"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Class--Accessor--Chained \
perl-Parse--CPAN--Meta"

inherit rpm

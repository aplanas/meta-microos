SUMMARY = "Set of version requirements for a CPAN dist"
DESCRIPTION = "A CPAN::Meta::Requirements object models a set of version constraints like \
those specified in the _META.yml_ or _META.json_ files in CPAN \
distributions, and as defined by CPAN::Meta::Spec. It can be built up by \
adding more and more constraints, and it will reduce them to the simplest \
representation. \
 \
Logically impossible constraints will be identified immediately by thrown \
exceptions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.143000"

RPM_NAME = "perl-CPAN-Meta-Requirements-2.143000-1.1.noarch.rpm"
RPM_HASH = "3eeb57bdad641ccab7a37989a33d9ee0d6d76b553723feb6e3a8f9c675ca8962302b38109e0d3df0675c43b287d24bcd6ec4df2dd04904ed23bc3f6a0f534d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Meta--Requirements \
perl-CPAN--Meta--Requirements--Range \
perl-CPAN-Meta-Requirements"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-version"

inherit rpm

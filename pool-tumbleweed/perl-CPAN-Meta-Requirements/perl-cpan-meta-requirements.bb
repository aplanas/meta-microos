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

RPM_NAME = "perl-CPAN-Meta-Requirements-2.143000-1.2.noarch.rpm"
RPM_HASH = "6e834043691909baf309818be0e4768d86015ca38fda1be1b16ce85f2144fd7fdb1773a9597427ecdc103136378cbd8471cb67538bd159e697729d07f221337f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Meta--Requirements \
perl-CPAN--Meta--Requirements--Range \
perl-CPAN-Meta-Requirements"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-version"

inherit rpm

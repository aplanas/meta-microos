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

PV = "2.142000"

RPM_NAME = "perl-CPAN-Meta-Requirements-2.142000-1.1.noarch.rpm"
RPM_HASH = "0c6826985de5dfce1c1af7e41ce60da521c8e356fddb929086e51e6f9651c5eecac4faa988a94d51c1c654bd69b1f00b76a1485e3ee102b78ba7d3bdf151566f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CPAN::Meta::Requirements) \
perl(CPAN::Meta::Requirements::Range) \
perl-CPAN-Meta-Requirements"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(version)"

inherit rpm

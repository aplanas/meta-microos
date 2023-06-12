SUMMARY = "Moo types for numbers"
DESCRIPTION = "A set of numeric types to be used in Moo-based classes. Adapted from \
MooseX::Types::Common::Numeric"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.03"

RPM_NAME = "perl-MooX-Types-MooseLike-Numeric-1.03-1.22.noarch.rpm"
RPM_HASH = "92b3bb6ded1091601344cf369f1d900a5ab6a3c3318f1bcd8a84902fdb841eb13956ab9e1063c4569a3aa31171bf723d7cc56b84fef7ff744e7907534dd205ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooX::Types::MooseLike::Numeric) \
perl-MooX-Types-MooseLike-Numeric"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(MooX::Types::MooseLike)"

inherit rpm

SUMMARY = "Moo types for numbers"
DESCRIPTION = "A set of numeric types to be used in Moo-based classes. Adapted from \
MooseX::Types::Common::Numeric"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.03"

RPM_NAME = "perl-MooX-Types-MooseLike-Numeric-1.03-1.24.noarch.rpm"
RPM_HASH = "a47b9d83d4b4a06051a23bea581b85d97a40827d5b8bd139082c94926d6b4afb9b6ac44232b8c0e0a861ad6cc314a7a741236068ab5dd61ca8065fb5b173c68e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Types--MooseLike--Numeric \
perl-MooX-Types-MooseLike-Numeric"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MooX--Types--MooseLike"

inherit rpm

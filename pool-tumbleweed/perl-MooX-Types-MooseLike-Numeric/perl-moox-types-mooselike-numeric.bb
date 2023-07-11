SUMMARY = "Moo types for numbers"
DESCRIPTION = "A set of numeric types to be used in Moo-based classes. Adapted from \
MooseX::Types::Common::Numeric"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.03"

RPM_NAME = "perl-MooX-Types-MooseLike-Numeric-1.03-1.23.noarch.rpm"
RPM_HASH = "3129cea2c6810f8fc8e2c80f54e7670385505214060566aa1dd74945f203e67e4da0b48905d77c3ca2cb7f17ac3201d9b9bc865144db08017f1cd1b11e5fbb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Types--MooseLike--Numeric \
perl-MooX-Types-MooseLike-Numeric"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MooX--Types--MooseLike"

inherit rpm

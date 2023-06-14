SUMMARY = "L<DateTime> related constraints and coercions for Moose"
DESCRIPTION = "This module packages several the Moose::Util::TypeConstraints manpage with \
coercions, designed to work with the the DateTime manpage suite of objects. \
 \
Namespaced Example: \
 \
    use MooseX::Types::DateTime; \
 \
    has time_zone => ( \
        isa => 'DateTime::TimeZone', \
        is => 'rw', \
        coerce => 1, \
    ); \
 \
    Class->new( time_zone => 'Africa/Timbuktu' );"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.13"

RPM_NAME = "perl-MooseX-Types-DateTime-0.13-1.23.noarch.rpm"
RPM_HASH = "112f2f9c14e3377b86263c4d30c27073d1ea045b6bb5e802b1db4400d2a7bd1b4f33f4452719fc1cb0ad22569b95eb146468a35ab3b2314fc8116dc93bd8afe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--DateTime \
perl-MooseX-Types-DateTime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-DateTime \
perl-DateTime--Duration \
perl-DateTime--Locale \
perl-DateTime--TimeZone \
perl-Moose \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-namespace--clean"

inherit rpm

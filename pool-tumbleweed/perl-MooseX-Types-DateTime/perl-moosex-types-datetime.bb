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

RPM_NAME = "perl-MooseX-Types-DateTime-0.13-1.24.noarch.rpm"
RPM_HASH = "1852f8ea0df62c02ef89f7594d506e3c209c9ba3825c429a2079130095496ab41830fba053fb6c2187dce1793257fc82645ce768349a31a5bd6c2be735a9b571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--DateTime \
perl-MooseX-Types-DateTime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime \
perl-DateTime--Duration \
perl-DateTime--Locale \
perl-DateTime--TimeZone \
perl-Moose \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-namespace--clean"

inherit rpm

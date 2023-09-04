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

RPM_NAME = "perl-MooseX-Types-DateTime-0.13-1.25.noarch.rpm"
RPM_HASH = "23fd28672f27a9e720af42b521eaccf920434dcff8b1a584dd8e048b28b6c0a9959c0adc88489e0e7a72ff06f80b01a2b6160ed95e2b996e3efee3cbc5126ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--DateTime \
perl-MooseX-Types-DateTime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-DateTime--Duration \
perl-DateTime--Locale \
perl-DateTime--TimeZone \
perl-Moose \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-namespace--clean"

inherit rpm

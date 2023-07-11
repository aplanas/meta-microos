SUMMARY = "Path::Class type library for Moose"
DESCRIPTION = "MooseX::Types::Path::Class creates common Moose types, coercions and option \
specifications useful for dealing with Path::Class objects as Moose \
attributes. \
 \
Coercions (see Moose::Util::TypeConstraints) are made from both 'Str' and \
'ArrayRef' to both Path::Class::Dir and Path::Class::File objects. If you \
have MooseX::Getopt installed, the 'Getopt' option type ('=s') will be \
added for both Path::Class::Dir and Path::Class::File."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.09"

RPM_NAME = "perl-MooseX-Types-Path-Class-0.09-1.22.noarch.rpm"
RPM_HASH = "99cc813df578900f10316832c8ddb0185e999b47e2502e40eeee7d2ce7c72d1325deb27e4060c09e34978ab904392a721abc19049e6b336f3ee5e53ba626ce19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Path--Class \
perl-MooseX-Types-Path-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Path--Class"

inherit rpm

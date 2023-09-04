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

RPM_NAME = "perl-MooseX-Types-Path-Class-0.09-1.23.noarch.rpm"
RPM_HASH = "68899cce2e4fb637b1f0c5e387c423f25dd566923e50686d77ebe8442f27359f67ce632fb3bac19756e6d68da96b1e7d1d8b1613ea4f54cea8a4f6c5bd26a1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Path--Class \
perl-MooseX-Types-Path-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Path--Class"

inherit rpm

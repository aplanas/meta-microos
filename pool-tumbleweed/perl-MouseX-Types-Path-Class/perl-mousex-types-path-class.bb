SUMMARY = "Path::Class type library for Mouse"
DESCRIPTION = "MouseX::Types::Path::Class creates common Mouse types, coercions and option \
specifications useful for dealing with Path::Class objects as Mouse \
attributes. \
 \
Coercions (see Mouse::Util::TypeConstraints) are made from both 'Str' and \
'ArrayRef' to both Path::Class::Dir and Path::Class::File objects. If you \
have MouseX::Getopt installed, the Getopt option type ('=s') will be added \
for both Path::Class::Dir and Path::Class::File."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-MouseX-Types-Path-Class-0.07-4.20.noarch.rpm"
RPM_HASH = "c138fb9b7012fec19f02c2d679c544442a3a4594068845bcd7a4ac781c5e163df717f70ad92b11857cf20d132e42310f3045e344715475af2f94643cd961fc94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--Types--Path--Class \
perl-MouseX-Types-Path-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Mouse \
perl-MouseX--Types \
perl-Path--Class"

inherit rpm

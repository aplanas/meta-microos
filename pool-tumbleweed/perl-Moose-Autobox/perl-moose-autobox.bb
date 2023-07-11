SUMMARY = "Autoboxed wrappers for Native Perl datatypes"
DESCRIPTION = "Moose::Autobox provides an implementation of SCALAR, ARRAY, HASH & CODE for \
use with autobox. It does this using a hierarchy of roles in a manner \
similar to what Perl 6 _might_ do. This module, like Class::MOP and Moose, \
was inspired by my work on the Perl 6 Object Space, and the 'core types' \
implemented there."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.16"

RPM_NAME = "perl-Moose-Autobox-0.16-1.23.noarch.rpm"
RPM_HASH = "f5d8c5b15d8d9c051c8b7f7cd076757ade353ee67fb5760e0aad20752338cb3e707f9df40633110e3a8d758c54a6301a42fde92f84aa42878a6c94426f3c8fb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Moose--Autobox \
perl-Moose--Autobox--Array \
perl-Moose--Autobox--Code \
perl-Moose--Autobox--Defined \
perl-Moose--Autobox--Hash \
perl-Moose--Autobox--Indexed \
perl-Moose--Autobox--Item \
perl-Moose--Autobox--List \
perl-Moose--Autobox--Number \
perl-Moose--Autobox--Ref \
perl-Moose--Autobox--Scalar \
perl-Moose--Autobox--String \
perl-Moose--Autobox--Undef \
perl-Moose--Autobox--Value \
perl-Moose-Autobox"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-List--MoreUtils \
perl-Moose \
perl-Moose--Role \
perl-Moose--Util \
perl-Syntax--Keyword--Junction--All \
perl-Syntax--Keyword--Junction--Any \
perl-Syntax--Keyword--Junction--None \
perl-Syntax--Keyword--Junction--One \
perl-autobox \
perl-metaclass \
perl-namespace--autoclean \
perl-parent"

inherit rpm

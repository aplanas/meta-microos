SUMMARY = "Autoboxed wrappers for Native Perl datatypes"
DESCRIPTION = "Moose::Autobox provides an implementation of SCALAR, ARRAY, HASH & CODE for \
use with autobox. It does this using a hierarchy of roles in a manner \
similar to what Perl 6 _might_ do. This module, like Class::MOP and Moose, \
was inspired by my work on the Perl 6 Object Space, and the 'core types' \
implemented there."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.16"

RPM_NAME = "perl-Moose-Autobox-0.16-1.24.noarch.rpm"
RPM_HASH = "d61f61057a825916a06db9760289553abd4f99cace73bdea4286ec5458561acff37b560a5115ec32505a3c01f3e2acee38b5976aaaafed00761ed4e32ca29a32"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
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

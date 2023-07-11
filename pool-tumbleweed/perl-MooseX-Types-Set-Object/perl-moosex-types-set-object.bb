SUMMARY = "Set::Object type with coercions and stuff"
DESCRIPTION = "This module provides a Moose type constraint (see the \
Moose::Util::TypeConstraints manpage, the MooseX::Types manpage). Note that \
this constraint and its coercions are *global*, not simply limited to the \
scope that imported it -- in this way it acts like a regular the Moose \
manpage type constraint, rather than one from the MooseX::Types manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-MooseX-Types-Set-Object-0.05-1.24.noarch.rpm"
RPM_HASH = "d4e97f36aa698eb01392aaf0b1835249366a045b147ccb34a4ae1023d41164b38d4817c6bcd224a5b69381b24b8ab862c17b851eb55a6ade26c02f946edba3b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Set--Object \
perl-MooseX-Types-Set-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Set--Object"

inherit rpm

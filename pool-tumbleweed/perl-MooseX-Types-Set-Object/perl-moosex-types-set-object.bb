SUMMARY = "Set::Object type with coercions and stuff"
DESCRIPTION = "This module provides a Moose type constraint (see the \
Moose::Util::TypeConstraints manpage, the MooseX::Types manpage). Note that \
this constraint and its coercions are *global*, not simply limited to the \
scope that imported it -- in this way it acts like a regular the Moose \
manpage type constraint, rather than one from the MooseX::Types manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-MooseX-Types-Set-Object-0.05-1.25.noarch.rpm"
RPM_HASH = "e072fc5d62291e9db45cc587bb3394dd6a0c21df989d7bd37921becda2ceaaf2c3f20bec7c65639839906359425ced1ce8d6272b282a12bb9cd080598077eb44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Set--Object \
perl-MooseX-Types-Set-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Set--Object"

inherit rpm

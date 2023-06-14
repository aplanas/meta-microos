SUMMARY = "Set::Object type with coercions and stuff"
DESCRIPTION = "This module provides a Moose type constraint (see the \
Moose::Util::TypeConstraints manpage, the MooseX::Types manpage). Note that \
this constraint and its coercions are *global*, not simply limited to the \
scope that imported it -- in this way it acts like a regular the Moose \
manpage type constraint, rather than one from the MooseX::Types manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-MooseX-Types-Set-Object-0.05-1.23.noarch.rpm"
RPM_HASH = "eb9442e42c70d9f09f2101de44167a45cd12f53625d33d6c0c6daa25fb45ac2e9d10c3d2c35cc187a4ad9e60360122f0d48af18e641e91ff06177e72575c554a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Set--Object \
perl-MooseX-Types-Set-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Moose \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Set--Object"

inherit rpm

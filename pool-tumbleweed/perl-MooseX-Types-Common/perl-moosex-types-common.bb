SUMMARY = "Library of Commonly Used Type Constraints"
DESCRIPTION = "A set of commonly-used type constraints that do not ship with Moose by \
default."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.001014"

RPM_NAME = "perl-MooseX-Types-Common-0.001014-1.23.noarch.rpm"
RPM_HASH = "75cb099b779c2d22a3fde08bf36c8e237795c6cd37043bc86d24f349078a0fb53acc1d54a243613a2ccfc9ff59db3fa5759a6c7ef548c98694820d90af694065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Common \
perl-MooseX--Types--Common--Numeric \
perl-MooseX--Types--Common--String \
perl-MooseX-Types-Common"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MooseX--Types \
perl-MooseX--Types--Moose"

inherit rpm

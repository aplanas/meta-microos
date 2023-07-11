SUMMARY = "Library of Commonly Used Type Constraints"
DESCRIPTION = "A set of commonly-used type constraints that do not ship with Moose by \
default."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.001014"

RPM_NAME = "perl-MooseX-Types-Common-0.001014-1.22.noarch.rpm"
RPM_HASH = "1fb643ccf9c0c0307774465c4e5792833568c1f63a9396af19051166962530dae9ae17e42be3cd1c4fb69a0fce832212b61753f55531b2e6ae8d64328f9e4547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Common \
perl-MooseX--Types--Common--Numeric \
perl-MooseX--Types--Common--String \
perl-MooseX-Types-Common"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MooseX--Types \
perl-MooseX--Types--Moose"

inherit rpm

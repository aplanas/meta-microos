SUMMARY = "Moose types that check against Perl syntax"
DESCRIPTION = "This library provides Moose types for checking things (mostly strings) \
against syntax that is, or is a reasonable subset of, Perl syntax."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.101344"

RPM_NAME = "perl-MooseX-Types-Perl-0.101344-1.4.noarch.rpm"
RPM_HASH = "6ef6cbf3a1f4af8a8075b4de27e3f0e0316ef2f6ca6177c01618ff3fdf90801055e2d8324779f3901d5a61ef940f15fe231023804ad33af122a67b0cacfeb542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Perl \
perl-MooseX-Types-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Params--Util \
perl-version"

inherit rpm

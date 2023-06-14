SUMMARY = "Efficient generation of subroutines via string eval"
DESCRIPTION = "This package provides performant ways to generate subroutines from strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.006008"

RPM_NAME = "perl-Sub-Quote-2.006008-1.1.noarch.rpm"
RPM_HASH = "5bfdefcc979b48f909dd95834cdd328ebf7bc04a99d418337c640b42fc37fc7dcd2a670eaddf5c220d5dc191c14342ffb08d3f53bea357ebef75c592d11bc7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Defer \
perl-Sub--Quote \
perl-Sub-Quote"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm

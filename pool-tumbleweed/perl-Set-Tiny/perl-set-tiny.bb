SUMMARY = "Simple sets of strings"
DESCRIPTION = "Set::Tiny is a thin wrapper around regular Perl hashes to perform often \
needed set operations, such as testing two sets of strings for equality, or \
checking whether one is contained within the other. \
 \
For a more complete implementation of mathematical set theory, see \
Set::Scalar. For sets of arbitrary objects, see Set::Object."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Set-Tiny-0.04-1.12.noarch.rpm"
RPM_HASH = "6a6d2dafc75e3d6eec77580aeb7f8fd7cbf0a4c4ad1cde9f06dd189cd78a7b0a158450195f516dfdab0b93cc0a5cb4d920de711dfcb4ad0cabd0cf4311543b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Set--Tiny \
perl-Set-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

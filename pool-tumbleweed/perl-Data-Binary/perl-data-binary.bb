SUMMARY = "Simple detection of binary versus text in strings"
DESCRIPTION = "This simple module provides string equivalents to the -T / -B operators. \
Since these only work on file names and file handles, this module provides \
the same functions but on strings. \
 \
Note that the actual implementation is currently different, basically \
because the -T / -B functions are in C/XS, and this module is written in \
pure Perl. For now, anyway."
LICENSE = "Artistic-2.0"

PV = "0.01"

RPM_NAME = "perl-Data-Binary-0.01-1.9.noarch.rpm"
RPM_HASH = "6ed2fbdd5b5c747c93898dcd7f39bc036ca448f90399442a7cb1f3c5c8c516327e0b9bb34df3409a0a163e9d33ded9ec05c86de5a046b93109518cc2122192ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Binary) \
perl-Data-Binary"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

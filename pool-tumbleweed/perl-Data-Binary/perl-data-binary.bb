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

RPM_NAME = "perl-Data-Binary-0.01-1.11.noarch.rpm"
RPM_HASH = "139c3e1ddb5754532b44cb76e6465ac845cf3c7eb609ca310c4fff100e78a0893d4fde84199895f43f1432bff2ead5c58c62839679bc533fb268d37f538f33dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Binary \
perl-Data-Binary"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

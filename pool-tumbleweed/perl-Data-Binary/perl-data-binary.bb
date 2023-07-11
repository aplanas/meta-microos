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

RPM_NAME = "perl-Data-Binary-0.01-1.10.noarch.rpm"
RPM_HASH = "358cfcf849cddb191a74afc8574a06bbd4e6950d5d90f59320e2b03d76553243bc03383f7784eb96edbda80941563d8409d305365fadd786043681f466fa7f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Binary \
perl-Data-Binary"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

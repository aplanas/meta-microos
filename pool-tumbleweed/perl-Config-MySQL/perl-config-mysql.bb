SUMMARY = "Read and write MySQL-style configuration files"
DESCRIPTION = "This module extends Config::INI to support reading and writing MySQL-style \
configuration files. Although deceptively similar to standard '.INI' files, \
they can include bare boolean options with no value assignment and \
additional features like '!include' and '!includedir'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-Config-MySQL-0.02-2.21.noarch.rpm"
RPM_HASH = "2d64191ba42da8554ede07615cbb366d68601cd00b4e1aac6007181071a78c5a8c7725d22e2fdc9a8f0fdbc0949eb8732f9954c5988355f0265f1b051dd0b3e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--MySQL \
perl-Config--MySQL--Reader \
perl-Config--MySQL--Writer \
perl-Config-MySQL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Config--INI--Reader \
perl-Config--INI--Writer"

inherit rpm

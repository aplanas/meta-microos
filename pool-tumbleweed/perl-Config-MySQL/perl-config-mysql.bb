SUMMARY = "Read and write MySQL-style configuration files"
DESCRIPTION = "This module extends Config::INI to support reading and writing MySQL-style \
configuration files. Although deceptively similar to standard '.INI' files, \
they can include bare boolean options with no value assignment and \
additional features like '!include' and '!includedir'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-Config-MySQL-0.02-2.22.noarch.rpm"
RPM_HASH = "17fe1a7ee20bddbfdaac1644e9bcc384301588c79f70e2a3c44d8392c398519f4c0f7b469ceaf3d3e8a19cd6d3af46dc525c4ddf32db706875e17536257b578d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--MySQL \
perl-Config--MySQL--Reader \
perl-Config--MySQL--Writer \
perl-Config-MySQL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Config--INI--Reader \
perl-Config--INI--Writer"

inherit rpm

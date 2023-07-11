SUMMARY = "Boolean support for Perl"
DESCRIPTION = "Most programming languages have a native 'Boolean' data type. Perl does \
not. \
 \
Perl has a simple and well known Truth System. The following scalar values \
are false: \
 \
    $false1 = undef; \
    $false2 = 0; \
    $false3 = 0.0; \
    $false4 = ''; \
    $false5 = '0'; \
 \
Every other scalar value is true. \
 \
This module provides basic Boolean support, by defining two special \
objects: 'true' and 'false'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.46"

RPM_NAME = "perl-boolean-0.46-1.24.noarch.rpm"
RPM_HASH = "e3c1e15fb963b86c33f618557033d826be27ab9395b65c5df1541bdb592731f92545b551141c1a58239f4633aeeadf57e4e7ffbe981cd63add36fb438e3e7a85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-boolean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

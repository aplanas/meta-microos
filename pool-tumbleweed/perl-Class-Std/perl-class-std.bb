SUMMARY = "Support for creating standard 'inside-out' classes"
DESCRIPTION = "This module provides tools that help to implement the 'inside out object' \
class structure in a convenient and standard way. \
 \
_Portions of the following code and documentation from 'Perl Best \
Practices' copyright (c) 2005 by O'Reilly Media, Inc. and reprinted with \
permission._"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.013"

RPM_NAME = "perl-Class-Std-0.013-1.25.noarch.rpm"
RPM_HASH = "ff098c135a6697fc468a750a990015fb1c416d64de748c8ee5946023e430f4bb252ae30348e6af84546bfd9063299767d73b3f613052f91b82d0f498ec967b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Std \
perl-Class--Std--SCR \
perl-Class-Std"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

SUMMARY = "Support for creating standard 'inside-out' classes"
DESCRIPTION = "This module provides tools that help to implement the 'inside out object' \
class structure in a convenient and standard way. \
 \
_Portions of the following code and documentation from 'Perl Best \
Practices' copyright (c) 2005 by O'Reilly Media, Inc. and reprinted with \
permission._"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.013"

RPM_NAME = "perl-Class-Std-0.013-1.26.noarch.rpm"
RPM_HASH = "d58c3b7b4d751c374c38c897330ac08b102b9399103d00db738e4b2d30820c205d6f34a93007ab316b95955175acfcaad6853bbb4d308af2779ea7c082ed2086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Std \
perl-Class--Std--SCR \
perl-Class-Std"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

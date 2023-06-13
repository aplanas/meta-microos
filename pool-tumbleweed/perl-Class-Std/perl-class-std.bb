SUMMARY = "Support for creating standard 'inside-out' classes"
DESCRIPTION = "This module provides tools that help to implement the 'inside out object' \
class structure in a convenient and standard way. \
 \
_Portions of the following code and documentation from 'Perl Best \
Practices' copyright (c) 2005 by O'Reilly Media, Inc. and reprinted with \
permission._"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.013"

RPM_NAME = "perl-Class-Std-0.013-1.24.noarch.rpm"
RPM_HASH = "51cf53372182eacbb7cb84866773710f4e4a3681f0e65c054ff61abf578e44ae1efb59e0c217bc4aba72d5c3eee3f5d19394b2e9feb3ccb656607e7aaec21194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Std) \
perl(Class::Std::SCR) \
perl-Class-Std"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

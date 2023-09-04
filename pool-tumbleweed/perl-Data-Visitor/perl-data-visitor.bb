SUMMARY = "Visitor style traversal of Perl data structures"
DESCRIPTION = "This module is a simple visitor implementation for Perl values. \
 \
It has a main dispatcher method, 'visit', which takes a single perl value \
and then calls the methods appropriate for that value. \
 \
It can recursively map (cloning as necessary) or just traverse most \
structures, with support for per object behavior, circular structures, \
visiting tied structures, and all ref types (hashes, arrays, scalars, code, \
globs). \
 \
Data::Visitor is meant to be subclassed, but also ships with a callback \
driven subclass, Data::Visitor::Callback."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.32"

RPM_NAME = "perl-Data-Visitor-0.32-1.3.noarch.rpm"
RPM_HASH = "f3c6b42d8456640058c9e6022abe1d321a1f989ee1dd51012ac2fc53ca0b56131b7b19f779c63d40e48890d17dc0637d78550989788798d08ee6bbe5a8e42a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Visitor \
perl-Data--Visitor--Callback \
perl-Data-Visitor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Tie--ToObject \
perl-namespace--clean"

inherit rpm

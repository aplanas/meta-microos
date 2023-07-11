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

RPM_NAME = "perl-Data-Visitor-0.32-1.2.noarch.rpm"
RPM_HASH = "3199a5ce2d228bf82dbe4c10013f7051d69db80178a132410003d0873db8382f1d435f5b86e56c6b537873ef5433f6f11eb505f0f049c9da2ba5782b178fa893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Visitor \
perl-Data--Visitor--Callback \
perl-Data-Visitor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Tie--ToObject \
perl-namespace--clean"

inherit rpm

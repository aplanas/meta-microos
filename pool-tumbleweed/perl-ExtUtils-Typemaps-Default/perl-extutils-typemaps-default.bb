SUMMARY = "A set of useful typemaps"
DESCRIPTION = "'ExtUtils::Typemaps::Default' is an 'ExtUtils::Typemaps' subclass that \
provides a set of default mappings (in addition to what perl itself \
provides). These default mappings are currently defined as the combination \
of the mappings provided by the following typemap classes which are \
provided in this distribution: \
 \
the ExtUtils::Typemaps::ObjectMap manpage, the ExtUtils::Typemaps::STL \
manpage, the ExtUtils::Typemaps::Basic manpage"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.05"

RPM_NAME = "perl-ExtUtils-Typemaps-Default-1.05-3.25.noarch.rpm"
RPM_HASH = "0ae9eaf22c834eadfcbce6ed21815d45f116b04d8f327c21e4341be3bf9542a3525077ec6e2f39d0ef4f7b2cbbaa79f99ab449f7c0602840234dc5d2ad7fb598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Typemap--Basic \
perl-ExtUtils--Typemap--Default \
perl-ExtUtils--Typemap--ObjectMap \
perl-ExtUtils--Typemap--STL \
perl-ExtUtils--Typemap--STL--String \
perl-ExtUtils--Typemap--STL--Vector \
perl-ExtUtils--Typemaps--Basic \
perl-ExtUtils--Typemaps--Default \
perl-ExtUtils--Typemaps--ObjectMap \
perl-ExtUtils--Typemaps--STL \
perl-ExtUtils--Typemaps--STL--List \
perl-ExtUtils--Typemaps--STL--String \
perl-ExtUtils--Typemaps--STL--Vector \
perl-ExtUtils-Typemaps-Default"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--Typemaps"

inherit rpm

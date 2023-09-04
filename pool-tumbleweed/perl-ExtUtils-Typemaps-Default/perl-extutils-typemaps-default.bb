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

RPM_NAME = "perl-ExtUtils-Typemaps-Default-1.05-3.26.noarch.rpm"
RPM_HASH = "88db5c93e6c100da7a81f860ac69b8c1f9240ef7ef2b77e68e75a6c9101ebf8559864106e1fd03c4fb0d99ee58a0089f9ef0250a7e1304f819eaf96486dc7f4c"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--Typemaps"

inherit rpm

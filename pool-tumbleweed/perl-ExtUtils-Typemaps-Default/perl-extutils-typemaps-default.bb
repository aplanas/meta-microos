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

RPM_NAME = "perl-ExtUtils-Typemaps-Default-1.05-3.24.noarch.rpm"
RPM_HASH = "49cc95533c2447e61e7918285c622eb0e4d0ad45d39069bbc641c2ab9011c18626bd7036b00f96c13175f6f2061c924338b53cbd636f1dfafb4268c2fb50624e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(ExtUtils::Typemap::Basic) \
perl(ExtUtils::Typemap::Default) \
perl(ExtUtils::Typemap::ObjectMap) \
perl(ExtUtils::Typemap::STL) \
perl(ExtUtils::Typemap::STL::String) \
perl(ExtUtils::Typemap::STL::Vector) \
perl(ExtUtils::Typemaps::Basic) \
perl(ExtUtils::Typemaps::Default) \
perl(ExtUtils::Typemaps::ObjectMap) \
perl(ExtUtils::Typemaps::STL) \
perl(ExtUtils::Typemaps::STL::List) \
perl(ExtUtils::Typemaps::STL::String) \
perl(ExtUtils::Typemaps::STL::Vector) \
perl-ExtUtils-Typemaps-Default"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(ExtUtils::Typemaps)"

inherit rpm

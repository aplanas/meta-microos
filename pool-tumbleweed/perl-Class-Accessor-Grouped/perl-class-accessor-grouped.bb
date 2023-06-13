SUMMARY = "Lets you build groups of accessors"
DESCRIPTION = "This class lets you build groups of accessors that will call different \
getters and setters. The documentation of this module still requires a lot \
of work (*volunteers welcome >.>*), but in the meantime you can refer to at \
http://lo-f.at/glahn/2009/08/WritingPowerfulAccessorsForPerlClasses.html \
for more information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10014"

RPM_NAME = "perl-Class-Accessor-Grouped-0.10014-1.15.noarch.rpm"
RPM_HASH = "fb814f0df6b30246b0090f95e7c7eba0000b259722fbc6b24d2335e782b3b5fa53ce370b4f6b50bb1baa214535c3eedccb57a47491998f5c1e6aec8291a16427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Accessor::Grouped) \
perl-Class-Accessor-Grouped"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::XSAccessor) \
perl(Module::Runtime) \
perl(Sub::Name)"

inherit rpm

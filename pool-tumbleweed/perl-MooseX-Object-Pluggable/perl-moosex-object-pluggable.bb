SUMMARY = "Make your classes pluggable"
DESCRIPTION = "This module is meant to be loaded as a role from Moose-based classes. It \
will add five methods and four attributes to assist you with the loading \
and handling of plugins and extensions for plugins. I understand that this \
may pollute your namespace, however I took great care in using the least \
ambiguous names possible."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0014"

RPM_NAME = "perl-MooseX-Object-Pluggable-0.0014-1.24.noarch.rpm"
RPM_HASH = "189143cf2738f22135b564de5d699d369106e8e183174e12962772e627b876457f5bf0238711b6dc5d31d160cdec030e417f545ce784ebdc0349aefa5aa3e21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Object::Pluggable) \
perl-MooseX-Object-Pluggable"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Module::Pluggable::Object) \
perl(Module::Runtime) \
perl(Moose::Role) \
perl(Moose::Util) \
perl(Try::Tiny) \
perl(namespace::autoclean)"

inherit rpm

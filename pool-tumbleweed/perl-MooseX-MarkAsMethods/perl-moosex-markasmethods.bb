SUMMARY = "Mark overload code symbols as methods"
DESCRIPTION = "MooseX::MarkAsMethods allows one to easily mark certain functions as Moose \
methods. This will allow other packages such as the namespace::autoclean \
manpage to operate without blowing away your overloads. After using \
MooseX::MarkAsMethods your overloads will be recognized by the Class::MOP \
manpage as being methods, and class extension as well as composition from \
roles with overloads will 'just work'. \
 \
By default we check for overloads, and mark those functions as methods. \
 \
If 'autoclean =&gt; 1' is passed to import on using this module, we will \
invoke namespace::autoclean to clear out non-methods."
LICENSE = "LGPL-2.1+"

PV = "0.15"

RPM_NAME = "perl-MooseX-MarkAsMethods-0.15-5.25.noarch.rpm"
RPM_HASH = "3c35c5889c2bfe8852c4bb3cd81bd4a7120f23ce05bf31f8102405c0063e12411cd2595e4f36251a269a7711f744b76fd90ebbddfe9a4d05ba91398c4adb1f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::MarkAsMethods) \
perl(MooseX::MarkAsMethods::MetaRole::MethodMarker) \
perl-MooseX-MarkAsMethods"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(B::Hooks::EndOfScope) \
perl(Moose) \
perl(Moose::Exporter) \
perl(Moose::Role) \
perl(Moose::Util::MetaRole) \
perl(namespace::autoclean)"

inherit rpm

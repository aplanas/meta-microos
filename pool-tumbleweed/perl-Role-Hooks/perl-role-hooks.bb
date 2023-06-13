SUMMARY = "Role callbacks"
DESCRIPTION = "This module allows a role to run a callback when it is applied to a class \
or to another role."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.008"

RPM_NAME = "perl-Role-Hooks-0.008-1.3.noarch.rpm"
RPM_HASH = "879e8bb5ed619e4af6b9f471ec667db05880ab20f395053e434df6031ece562063367adb62cca2689b4e006c6ee6530a7911210b9f458f30afcf106b032cc4aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Role::Hooks) \
perl-Role-Hooks"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Method::Modifiers) \
perl(List::Util)"

inherit rpm

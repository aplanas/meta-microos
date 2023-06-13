SUMMARY = "Mixin to add / call inheritable triggers"
DESCRIPTION = "Class::Trigger is a mixin class to add / call triggers (or hooks) that get \
called at some points you specify."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Class-Trigger-0.15-1.13.noarch.rpm"
RPM_HASH = "db0b3a043181a83b6a84161bc895effec77cc2a36f959e2529f5bf0e539e220b11d5f9278017c5bf77dfef12c7ad63b889eabec78b65b8f22fe136c073b7e4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Trigger) \
perl-Class-Trigger"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

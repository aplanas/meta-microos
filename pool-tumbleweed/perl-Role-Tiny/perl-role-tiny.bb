SUMMARY = "Roles: a nouvelle cuisine portion size slice of Moose"
DESCRIPTION = "'Role::Tiny' is a minimalist role composition tool."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.002004"

RPM_NAME = "perl-Role-Tiny-2.002004-1.10.noarch.rpm"
RPM_HASH = "27b4759b1fe4b2d45d7ccbe23f64baddf4208cf5f87c31c51d1c01c5fd69e07c3888a162dec1710127bb97ea2dba911592e84dce25a5d0fe506c069498d9583a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Role::Tiny) \
perl(Role::Tiny::With) \
perl-Role-Tiny"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

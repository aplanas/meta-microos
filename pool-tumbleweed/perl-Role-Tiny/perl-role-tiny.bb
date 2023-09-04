SUMMARY = "Roles: a nouvelle cuisine portion size slice of Moose"
DESCRIPTION = "'Role::Tiny' is a minimalist role composition tool."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.002004"

RPM_NAME = "perl-Role-Tiny-2.002004-1.12.noarch.rpm"
RPM_HASH = "b17868cf1e25193a7728487c5b2ed24549ef335c8ac63243978a775eb1a8366499e35e61899d8a1cfa16672444dce1b8666fc551fae565254c87a69b978d9649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--Tiny \
perl-Role--Tiny--With \
perl-Role-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

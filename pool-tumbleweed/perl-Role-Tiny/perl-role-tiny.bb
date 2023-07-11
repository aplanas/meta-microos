SUMMARY = "Roles: a nouvelle cuisine portion size slice of Moose"
DESCRIPTION = "'Role::Tiny' is a minimalist role composition tool."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.002004"

RPM_NAME = "perl-Role-Tiny-2.002004-1.11.noarch.rpm"
RPM_HASH = "874e7bba07f66aa9d2b7514e434ba59ebd2387eaa9b7e9fa2c68267e9fabc31bbdaa04cc05a1af087d6d004cd219b81e0a254bf9305720d2764db5b057d0524d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--Tiny \
perl-Role--Tiny--With \
perl-Role-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

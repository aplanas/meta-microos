SUMMARY = "Role callbacks"
DESCRIPTION = "This module allows a role to run a callback when it is applied to a class \
or to another role."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.008"

RPM_NAME = "perl-Role-Hooks-0.008-1.5.noarch.rpm"
RPM_HASH = "43228899f9079eb431e13e45c6aac7d8f2ce79a5c19de959be7f716e3a27412ed5ef4a5b82c5e98d83003fc22daa20133e4c0e632ca677c5084cf8da26ac91da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--Hooks \
perl-Role-Hooks"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Method--Modifiers \
perl-List--Util"

inherit rpm

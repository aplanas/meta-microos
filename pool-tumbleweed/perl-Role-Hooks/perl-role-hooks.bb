SUMMARY = "Role callbacks"
DESCRIPTION = "This module allows a role to run a callback when it is applied to a class \
or to another role."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.008"

RPM_NAME = "perl-Role-Hooks-0.008-1.4.noarch.rpm"
RPM_HASH = "3fc82eccc6eebf28f3e64d18b25b07bc6c1a3d3f75b00095bbfd648f0d4f3e7f142c7c96f15ade0da488c9392a721ce7340fe706eb9213a1fc5c66c0cd1114a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--Hooks \
perl-Role-Hooks"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Method--Modifiers \
perl-List--Util"

inherit rpm

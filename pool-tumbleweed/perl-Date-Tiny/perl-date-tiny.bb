SUMMARY = "Date Object, with As Little Code As Possible"
DESCRIPTION = "*Date::Tiny* is a member of the DateTime::Tiny suite of time modules. \
 \
It implements an extremely lightweight object that represents a date, \
without any time data."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Date-Tiny-1.07-1.25.noarch.rpm"
RPM_HASH = "c3edebdc06b5c030ab03fc48406a77ba97875ec4f9daa7d3b91dcc99666f499bb1156bdf2339ee7ada5885b889c3845519e1dcfcca4e788478b65a1c1764b88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Tiny \
perl-Date-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

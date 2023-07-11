SUMMARY = "Date Object, with As Little Code As Possible"
DESCRIPTION = "*Date::Tiny* is a member of the DateTime::Tiny suite of time modules. \
 \
It implements an extremely lightweight object that represents a date, \
without any time data."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Date-Tiny-1.07-1.24.noarch.rpm"
RPM_HASH = "7adbaf97fe8327474d565f01b32b576f80a684a379a47f4151383ff09c851f8e1098f0e874b230044ac3c92b6dd8735b684674ab9335660d50f562f0c5e8788e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Tiny \
perl-Date-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

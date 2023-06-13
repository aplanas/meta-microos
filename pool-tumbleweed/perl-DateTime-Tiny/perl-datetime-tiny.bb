SUMMARY = "Date Object, with As Little Code As Possible"
DESCRIPTION = "*DateTime::Tiny* is a most prominent member of the DateTime::Tiny suite of \
time modules. \
 \
It implements an extremely lightweight object that represents a datetime."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.07"

RPM_NAME = "perl-DateTime-Tiny-1.07-1.17.noarch.rpm"
RPM_HASH = "cf79e191bc7388e3734e38a6eb653e5c26a23c43680dce5e91727039800757f97092feef712044d261eb7b5c0e472756bca434e073c10db2cefd1a5d324b8170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::Tiny) \
perl-DateTime-Tiny"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

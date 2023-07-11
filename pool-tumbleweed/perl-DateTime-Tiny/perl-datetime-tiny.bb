SUMMARY = "Date Object, with As Little Code As Possible"
DESCRIPTION = "*DateTime::Tiny* is a most prominent member of the DateTime::Tiny suite of \
time modules. \
 \
It implements an extremely lightweight object that represents a datetime."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.07"

RPM_NAME = "perl-DateTime-Tiny-1.07-1.18.noarch.rpm"
RPM_HASH = "fd08c5bf706fadce4cd0ec4b25fef6f1a5a244634aa8145603f3d94cd996224b2e5f3ba64ebf11554498186328847b4baf1152d1858ab93229a04e17301659c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Tiny \
perl-DateTime-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

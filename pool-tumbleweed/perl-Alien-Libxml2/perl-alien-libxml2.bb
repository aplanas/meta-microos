SUMMARY = "Install the C libxml2 library on your system"
DESCRIPTION = "This module provides 'libxml2' for other modules to use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-Alien-Libxml2-0.19-1.2.aarch64.rpm"
RPM_HASH = "6402e5c73ed899823d745de0cc0e224bd5320d68e9e019158657ff31167e684fca74ade509be9c4a8376e250c4481183b71dc8288470d6bd2bed50e086bb6249"

RPROVIDES:${PN} += "perl-Alien--Libxml2 \
perl-Alien--Libxml2--Install--Files \
perl-Alien-Libxml2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Alien--Base"

inherit rpm

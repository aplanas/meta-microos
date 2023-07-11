SUMMARY = "Basic method declarations with signatures, without source filters"
DESCRIPTION = "Basic method declarations with signatures, without source filters"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Method-Signatures-Simple-1.07-1.26.noarch.rpm"
RPM_HASH = "3ad826e3bce37aa049a9be088939f8db8169a8d73dab3a28d3ea71c3340017d36c463b5bcf3d32fa4023879b731fb18f88ae06c49afd6ab70af07538c4572228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Method--Signatures--Simple \
perl-Method-Signatures-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--Declare"

inherit rpm

SUMMARY = "Include files needed for development with FreeTDS"
DESCRIPTION = "The freetds-devel package contains the files necessary for development with \
the FreeTDS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.18"

RPM_NAME = "freetds-devel-1.3.18-1.1.aarch64.rpm"
RPM_HASH = "21c32e72df8ffc39bb56fcfac3b5402f6ce08032b33fb8b6c36076d350cb842ed39da39e3d957766234bc55d96b8e490b0afd7fccac60822195a4d188ba09b1b"

RPROVIDES:${PN} += "freetds-devel"

RDEPENDS:${PN} += "libct4 \
libsybdb5 \
libtdsodbc0"

inherit rpm

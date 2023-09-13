SUMMARY = "Include files needed for development with FreeTDS"
DESCRIPTION = "The freetds-devel package contains the files necessary for development with \
the FreeTDS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.20"

RPM_NAME = "freetds-devel-1.3.20-1.1.aarch64.rpm"
RPM_HASH = "512e918351d47c566088ab76306201dc032fcd7de678e3c8823b5ca54804f5543109e35ce7dd5288f33602ac3c49bfc0b09eefc9187eb30c0d9d9897de83b790"

RPROVIDES:${PN} += "freetds-devel"

RDEPENDS:${PN} += "libct4 \
libsybdb5 \
libtdsodbc0"

inherit rpm

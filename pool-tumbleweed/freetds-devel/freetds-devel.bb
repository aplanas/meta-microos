SUMMARY = "Include files needed for development with FreeTDS"
DESCRIPTION = "The freetds-devel package contains the files necessary for development with \
the FreeTDS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.17"

RPM_NAME = "freetds-devel-1.3.17-1.3.aarch64.rpm"
RPM_HASH = "edb901291db131e0a28f5654f938c8d3f2c54a944ea26bd97a96c5a7e6d7d374a4f8be90b7f97cf5f78ac749d57fe0cdc0653a11995f670d8dffe5999d2c0c7a"

RPROVIDES:${PN} += "freetds-devel \
freetds-devel(aarch-64)"

RDEPENDS:${PN} += "libct4 \
libsybdb5 \
libtdsodbc0"

inherit rpm

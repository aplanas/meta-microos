SUMMARY = "Development tools for Log for C++"
DESCRIPTION = "The static libraries and header files needed for development with log4shib."
LICENSE = "LGPL-2.1-only"

PV = "2.0.1"

RPM_NAME = "liblog4shib-devel-2.0.1-1.9.aarch64.rpm"
RPM_HASH = "d5a60f827f1659449dd0f05e78170c8268796bbe6f8097803090b6590a1730d8bfcf05c7c7578c4fa193888329381726a390582e450de83bcc61ebec02161420"

RPROVIDES:${PN} += "liblog4shib-devel \
log4shib-devel \
pkgconfig-log4shib"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libboost-thread-devel \
liblog4shib2"

inherit rpm

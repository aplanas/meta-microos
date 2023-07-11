SUMMARY = "Development files for libyang"
DESCRIPTION = "Libyang implements functions to process schemas expressed in the \
YANG data modeling language defined by the IETF in RFCs 6020/7950. \
Schemas expressed in this language primarily describe configuration \
used by larger network equipment like routers and switches. \
 \
In addition to handling the schemas itself, the library also provides \
functions to process data described by the schemas. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libyang."
LICENSE = "BSD-3-Clause"

PV = "2.1.55"

RPM_NAME = "libyang-devel-2.1.55-1.2.aarch64.rpm"
RPM_HASH = "89d6d58cdf56770b28082e3fd48e25c38242da9d066c6ad721c1e1d3c4015a97aea106cdec93edd389afae72407e04241a451a139c55cc1014196690e037b7ea"

RPROVIDES:${PN} += "libyang-devel \
pkgconfig-libyang"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyang2 \
pkgconfig-libpcre2-8"

inherit rpm

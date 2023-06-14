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

RPM_NAME = "libyang-devel-2.1.55-1.1.aarch64.rpm"
RPM_HASH = "feddf9a6c365bb105ee3b960d10fc7846bff22088cd61cd825a1235f541e57f4d80bb01ec64c09861912e4d4b70e8e4be9330b362e5433398128cb0c0b2e065c"

RPROVIDES:${PN} += "libyang-devel \
pkgconfig-libyang"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyang2 \
pkgconfig-libpcre2-8"

inherit rpm

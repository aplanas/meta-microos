SUMMARY = "Development tools for Log for C++"
DESCRIPTION = "The log4cpp-devel package contains the static libraries and header files \
needed for development with log4cpp."
LICENSE = "LGPL-2.1-only"

PV = "1.1.3"

RPM_NAME = "log4cpp-devel-1.1.3-2.19.aarch64.rpm"
RPM_HASH = "d07fae45cb4e0172af16af4ae784ea88b7826c300e20ad22432743740db218a447aad63516e0aa5dd7f742a2baf067e20bff0fe3181bafb8f117bf5d73c260f0"

RPROVIDES:${PN} += "log4cpp-devel \
log4cpp-devel(aarch-64) \
pkgconfig(log4cpp)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
liblog4cpp5"

inherit rpm

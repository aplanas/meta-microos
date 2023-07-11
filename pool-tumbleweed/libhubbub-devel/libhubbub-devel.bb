SUMMARY = "Development files for libhubbub"
DESCRIPTION = "The libhubbub-devel package contains libraries and header files for \
developing applications that use libhubbub."
LICENSE = "MIT"

PV = "0.3.7"

RPM_NAME = "libhubbub-devel-0.3.7-2.10.aarch64.rpm"
RPM_HASH = "97da0ed07cf1a4e7a4b851092c3d062414650cb669082e98e5c729ae7936bcda8603fbc53df1cd7cc3496755039a62b5d88366cc4dbcaa28f59811a4789a9730"

RPROVIDES:${PN} += "libhubbub-devel \
pkgconfig-libhubbub"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhubbub0 \
pkgconfig-libparserutils"

inherit rpm

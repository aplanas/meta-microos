SUMMARY = "Development files for libhubbub"
DESCRIPTION = "The libhubbub-devel package contains libraries and header files for \
developing applications that use libhubbub."
LICENSE = "MIT"

PV = "0.3.7"

RPM_NAME = "libhubbub-devel-0.3.7-2.9.aarch64.rpm"
RPM_HASH = "5b4af48b992b6383698577f101f34dff06d6af5dba1adcc674de81c7588ec32531937ebd776503c695f19ec4922cfbfc01d18d1af1f8919055f3c8e7c1c85259"

RPROVIDES:${PN} += "libhubbub-devel \
libhubbub-devel(aarch-64) \
pkgconfig(libhubbub)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhubbub0 \
pkgconfig(libparserutils)"

inherit rpm

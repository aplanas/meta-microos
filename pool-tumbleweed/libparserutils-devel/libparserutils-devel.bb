SUMMARY = "Development files for libparserutils"
DESCRIPTION = "The libparserutils-devel package contains libraries and header files for \
developing applications that use libparserutils."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "libparserutils-devel-0.2.4-2.8.aarch64.rpm"
RPM_HASH = "77a13fc4929bdcbd5d77af38e50f32a6e544e758f496776884365bc4338447a712aaaa18b1821c14744dc172913d237c0119dabdbdaa52ed1b05bfcd062859ae"

RPROVIDES:${PN} += "libparserutils-devel \
libparserutils-devel(aarch-64) \
pkgconfig(libparserutils)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libparserutils0"

inherit rpm

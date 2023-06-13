SUMMARY = "Development files for libbaseencode"
DESCRIPTION = "Pkg-config and header files for developing applications that use libbaseencode"
LICENSE = "Apache-2.0"

PV = "1.0.15"

RPM_NAME = "libbaseencode-devel-1.0.15-1.2.aarch64.rpm"
RPM_HASH = "8736b200b031616651c940a708fe1c9a3e6e397a84ded29a9dea2899b44cba4b8a9b3821e51c3526167211a32db53d2a79f2dbf3ea3e52bf1458e1a736c429c7"

RPROVIDES:${PN} += "libbaseencode-devel \
libbaseencode-devel(aarch-64) \
pkgconfig(baseencode)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbaseencode1"

inherit rpm

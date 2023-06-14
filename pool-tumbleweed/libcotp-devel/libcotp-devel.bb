SUMMARY = "Development files for libcotp"
DESCRIPTION = "Pkg-config and header files for developing applications that use libcotp"
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "libcotp-devel-2.0.1-1.1.aarch64.rpm"
RPM_HASH = "eba9562c28cef2aa317f97f6b784a2e9bbc860fec04de2b825604690f922c93fe337f6390e4a983bb580caae702f10acd827166ac17cdff9d5c55521e3f6e7ca"

RPROVIDES:${PN} += "libcotp-devel \
pkgconfig-cotp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcotp2"

inherit rpm

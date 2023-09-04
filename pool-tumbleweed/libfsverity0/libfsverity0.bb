SUMMARY = "Library package for fsverity-utils"
DESCRIPTION = "Shared-object dependencies for fsverity-utils."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "libfsverity0-1.5-1.1.aarch64.rpm"
RPM_HASH = "b7fea7e8148b78a26b10148c6109ab774a02e71dc52b0f7a9686db24cbf06eb3368324404f69960fc6b6e935101d7e1b01870cc0671a3107a08f97c50cdb5722"

RPROVIDES:${PN} += "libfsverity.so.0 \
libfsverity0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3"

inherit rpm

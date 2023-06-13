SUMMARY = "Unofficial C-API for the Last.fm Web Service"
DESCRIPTION = "libclastfm development files. \
 \
libclastfm is an unofficial C-API for the Last.fm web service written \
with libcurl. Has support for Album, Artist and User API methods as well \
as full audio scrobbler support."
LICENSE = "GPL-3.0+"

PV = "0.5"

RPM_NAME = "libclastfm-devel-0.5-9.26.aarch64.rpm"
RPM_HASH = "15d18c6a39ded5a3e7d8890ce3ad0a0c620052c81964cf392b693094f498f5de54344b6cd6c68d55597e5e12c9d8f31ab67fc81f92579149d0089b0ea8a97d57"

RPROVIDES:${PN} += "libclastfm-devel \
libclastfm-devel(aarch-64) \
pkgconfig(libclastfm)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclastfm0 \
pkgconfig(libcurl)"

inherit rpm

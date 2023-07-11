SUMMARY = "Unofficial C-API for the Last.fm Web Service"
DESCRIPTION = "libclastfm development files. \
 \
libclastfm is an unofficial C-API for the Last.fm web service written \
with libcurl. Has support for Album, Artist and User API methods as well \
as full audio scrobbler support."
LICENSE = "GPL-3.0+"

PV = "0.5"

RPM_NAME = "libclastfm-devel-0.5-9.27.aarch64.rpm"
RPM_HASH = "046320ca3171502de7b4df014a732cd4ea6d30eda9ff41893411ed089a0ecc5e59ee073919cef631d52ecb2a932ab2df1654af9655ce394d279d2a9918be7377"

RPROVIDES:${PN} += "libclastfm-devel \
pkgconfig-libclastfm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclastfm0 \
pkgconfig-libcurl"

inherit rpm

SUMMARY = "Header files for ulfius"
DESCRIPTION = "Development and header files for libulfius."
LICENSE = "MIT"

PV = "2.7.12"

RPM_NAME = "ulfius-devel-2.7.12-1.4.aarch64.rpm"
RPM_HASH = "cb37ed20a0296e50c6e66f37665252b2970d151452ab1c8fc6fda2b09f492d4c505e5b45efcc37dd956ca44ab96866b9e18af932c5cafecc46604b3effdb333d"

RPROVIDES:${PN} += "cmake-Ulfius \
pkgconfig-libulfius \
ulfius-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcurl-devel \
libgnutls-devel \
libjansson-devel \
libmicrohttpd-devel \
libulfius2-7 \
orcania-devel \
pkgconfig-gnutls \
pkgconfig-jansson \
pkgconfig-libcurl \
pkgconfig-libmicrohttpd \
pkgconfig-liborcania \
pkgconfig-libyder \
yder-devel \
zlib-devel"

inherit rpm

SUMMARY = "Development files of soxr"
DESCRIPTION = "The soxr development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libsoxr/libsoxr-lsr."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "soxr-devel-0.1.3-2.15.aarch64.rpm"
RPM_HASH = "7b0f2e8462a589eb2f578aca3c6e29c9f21deb415bd2f28e329b731026e74449a22b5799abfe412adc9da6264ea24da772026a2e5fa9a2d261bab0722bca07ed"

RPROVIDES:${PN} += "pkgconfig(soxr) \
pkgconfig(soxr-lsr) \
soxr-devel \
soxr-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoxr-lsr0 \
libsoxr0"

inherit rpm

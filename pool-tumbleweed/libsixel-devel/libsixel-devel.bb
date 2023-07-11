SUMMARY = "Development files for libsixel"
DESCRIPTION = "Development files for libsixel, a C encoder/decoder implementation for DEC SIXEL graphics."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel-devel-1.10.3-1.8.aarch64.rpm"
RPM_HASH = "b5dc19abd70f50729fca30f00aff84bd1bd1542d360d12bb8a22a6b49d86c534018a812851eb7a6523e24fd7e79572b3b5c93835d69be0ea370d4f7b30808ae4"

RPROVIDES:${PN} += "libsixel-devel \
pkgconfig-libsixel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsixel1"

inherit rpm

SUMMARY = "Development files for libsixel"
DESCRIPTION = "Development files for libsixel, a C encoder/decoder implementation for DEC SIXEL graphics."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel-devel-1.10.3-1.7.aarch64.rpm"
RPM_HASH = "27d48dc25507fa998e0c5af7baf39f184300fc15bb9783c74b70729b3068380163f1533d3abba57f50fcb9572fb8c6c556ea7a8ce0665d85c383f5f0b5ce84d8"

RPROVIDES:${PN} += "libsixel-devel \
libsixel-devel(aarch-64) \
pkgconfig(libsixel)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsixel1"

inherit rpm

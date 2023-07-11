SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "libcelt-devel-0.11.3-1.29.aarch64.rpm"
RPM_HASH = "cd75ee1a63eb82ea84516c777a440e247cf358dc19ffa0eee563255575976f180cacd421372b296bf5db0da19044f4ad6e3df12316946f8574f5fe444ae076fd"

RPROVIDES:${PN} += "libcelt-devel \
pkgconfig-celt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
celt \
glibc-devel \
libcelt0-2 \
pkg-config"

inherit rpm

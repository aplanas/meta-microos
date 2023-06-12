SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "libcelt-devel-0.11.3-1.28.aarch64.rpm"
RPM_HASH = "892a3e7fc878e555468b502845d684609fbea33ff27198b525145e6c12019a9cb632162220be85126cc1959b3fbfbee42dab93c8920df686c0691f7a2af1fa8d"

RPROVIDES:${PN} += "libcelt-devel \
libcelt-devel(aarch-64) \
pkgconfig(celt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
celt \
glibc-devel \
libcelt0-2 \
pkgconf-pkg-config"

inherit rpm

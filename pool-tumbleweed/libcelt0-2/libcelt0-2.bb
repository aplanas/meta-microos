SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "libcelt0-2-0.11.3-1.29.aarch64.rpm"
RPM_HASH = "dc0fda130bb59302eaaf8b43644e5a11fe0d845d820cb4ec36b2ec5a28578e5b965b0a0c5b1842cab2a3921881a6329e7aff3c07300eba7b44cf889f81b1eacf"

RPROVIDES:${PN} += "libcelt0-2 \
libcelt0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

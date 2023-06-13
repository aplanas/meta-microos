SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "libcelt0-2-0.11.3-1.28.aarch64.rpm"
RPM_HASH = "5fece7a57e52a0eb760668eb8e37ce5c3906d6884f0b0db55566f0fd483ebdf382b33ac34968cc78ebb9dd042238d8b8990314fd2179e05fc9c7780c985897d9"

RPROVIDES:${PN} += "libcelt0-2 \
libcelt0-2(aarch-64) \
libcelt0.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm

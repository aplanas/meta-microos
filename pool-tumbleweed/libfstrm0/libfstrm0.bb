SUMMARY = "Frame Streams implementation in C"
DESCRIPTION = "This is fstrm, a C implementation of the Frame Streams data transport protocol. \
 \
This packages holds the shared library file."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "libfstrm0-0.6.1-1.6.aarch64.rpm"
RPM_HASH = "27717010a99c9dbb4a20ac33b34c5a2555c65029870c678e0244929edfb213479acd2190c78d7f56b8b327a6b6a9a385e897fc1d9f545346e24cd954a7e56c92"

RPROVIDES:${PN} += "libfstrm.so.0 \
libfstrm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

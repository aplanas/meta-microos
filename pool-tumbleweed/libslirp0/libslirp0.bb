SUMMARY = "A networking Library"
DESCRIPTION = "A user-mode networking library used by virtual machines, containers \
or various tools."
LICENSE = "MIT"

PV = "4.7.0+44"

RPM_NAME = "libslirp0-4.7.0+44-3.3.aarch64.rpm"
RPM_HASH = "added6968d380ee4040597a6b0190ede7c195f3f4df346147b0f5e1bab8e17d4457b0ced98afca71e00fac7fd953905e86f9f4fba37e77732a46a781b7c3b710"

RPROVIDES:${PN} += "libslirp.so.0 \
libslirp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm

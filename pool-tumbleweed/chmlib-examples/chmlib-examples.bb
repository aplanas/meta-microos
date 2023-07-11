SUMMARY = "Example applications for chmlib"
DESCRIPTION = "This package contains examples built on chmlib which may be useful \
to convert chm files from command line."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40"

RPM_NAME = "chmlib-examples-0.40-24.9.aarch64.rpm"
RPM_HASH = "a4ce878a903d675f09cb972ce84834f03ecdcad2c2ec7edd8a933a021b816e379f86b691ba442aaa6dbad370a56da35ac81ab15af9f4efacfce278aa7001a0f1"

RPROVIDES:${PN} += "chmlib-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
libchm0"

inherit rpm

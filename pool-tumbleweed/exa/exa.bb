SUMMARY = "Replacement for ls written in Rust"
DESCRIPTION = "exa is a replacement for ls written in Rust. \
With similar but not identical options."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-0.10.1-3.6.aarch64.rpm"
RPM_HASH = "ed9a01f50baa9a39bb016d9372db2c72bc05526dd14acbc84cbba5c5c7c97e7fcb1d130652536c10b7130159ff6e6317421f0646681ab38db66b0f58e7de1ea4"

RPROVIDES:${PN} += "exa"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libz.so.1"

inherit rpm

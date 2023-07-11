SUMMARY = "Thin Python bindings to de/compression algorithms in Rust"
DESCRIPTION = "Extremely thin Python bindings to de/compression algorithms in Rust. \
Allows for using algorithms such as Snappy, without any system dependencies."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python39-cramjam-2.6.2-1.7.aarch64.rpm"
RPM_HASH = "c5b62e681dbf9a97f3574274e6fdd13b2e779bed15a4144d4b60e947003e3c19dbd9a89350442ee21721157a0da2ceb2c16f6a993f65f825bc9093e8702db695"

RPROVIDES:${PN} += "python3.9dist-cramjam \
python39-cramjam \
python3dist-cramjam"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm

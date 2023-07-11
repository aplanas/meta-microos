SUMMARY = "Thin Python bindings to de/compression algorithms in Rust"
DESCRIPTION = "Extremely thin Python bindings to de/compression algorithms in Rust. \
Allows for using algorithms such as Snappy, without any system dependencies."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python310-cramjam-2.6.2-1.7.aarch64.rpm"
RPM_HASH = "d9ec977f9d63ec95a15f70beaf1a7cce0be26c85c019cdb25aaf622884cabb757f697019db38115b4806d8a3e74c118c039656ff7866597bdd60e63d3752b6da"

RPROVIDES:${PN} += "python3.10dist-cramjam \
python310-cramjam \
python3dist-cramjam"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm

SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-numcodecs-0.11.0-1.6.aarch64.rpm"
RPM_HASH = "db935648184d854e86aa80f1b79b0311aae094b3d2518724dfcc902e3be49e1cbc0bb5671bdd8b2c8dac634a69e6f1b45233d7087b38d7c7548e58394458979a"

RPROVIDES:${PN} += "python3.9dist-numcodecs \
python39-numcodecs \
python3dist-numcodecs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
liblz4.so.1 \
libzstd.so.1 \
python-abi \
python39-entrypoints \
python39-numpy"

inherit rpm

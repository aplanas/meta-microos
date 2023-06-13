SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-numcodecs-0.11.0-1.5.aarch64.rpm"
RPM_HASH = "73b8e6e590fd11bdcfc0dd463cbe43d391284507604776685eb2b6195df3e97846eaa7901dd4fd489ff33412d532f3b2599b514337dfc041ae19bdd2c2a5763c"

RPROVIDES:${PN} += "python3-numcodecs \
python3.10dist(numcodecs) \
python310-numcodecs \
python310-numcodecs(aarch-64) \
python3dist(numcodecs)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblosc.so.1()(64bit) \
libc.so.6()(64bit) \
liblz4.so.1()(64bit) \
libzstd.so.1()(64bit) \
python(abi) \
python310-entrypoints \
python310-numpy"

inherit rpm

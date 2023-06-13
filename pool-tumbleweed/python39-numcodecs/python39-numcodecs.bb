SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-numcodecs-0.11.0-1.5.aarch64.rpm"
RPM_HASH = "8fd52cb3bd473c21359fb469d955c00e93210c973b979f31e1059c8a9ba826a2f505401a3a8b8cf34a84c5128d0dc66f5adb3068ea335f60212c08b310935596"

RPROVIDES:${PN} += "python3.9dist(numcodecs) \
python39-numcodecs \
python39-numcodecs(aarch-64) \
python3dist(numcodecs)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblosc.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblz4.so.1()(64bit) \
libzstd.so.1()(64bit) \
python(abi) \
python39-entrypoints \
python39-numpy"

inherit rpm

SUMMARY = "ZSTD Bindings for Python"
DESCRIPTION = "ZSTD Bindings for Python."
LICENSE = "BSD-2-Clause"

PV = "1.5.5.1"

RPM_NAME = "python310-zstd-1.5.5.1-1.1.aarch64.rpm"
RPM_HASH = "70399f79c0616d13739661e9dcb8f06c120255cc67dc92f9eef86f595565035467e4709eaee96a1d4042a3383c79608ca90983189e48525b7ee37de812681286"

RPROVIDES:${PN} += "python3-zstd \
python3.10dist(zstd) \
python310-zstd \
python310-zstd(aarch-64) \
python3dist(zstd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libzstd.so.1()(64bit) \
python(abi)"

inherit rpm

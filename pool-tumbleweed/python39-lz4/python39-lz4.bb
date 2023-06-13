SUMMARY = "LZ4 Bindings for Python"
DESCRIPTION = "This package provides python bindings for the lz4 compression library."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python39-lz4-4.3.2-1.4.aarch64.rpm"
RPM_HASH = "207f67b3f7bfc096bdeb6c153c5c851e7cc32eb0bcfd2100343c7f5b9fe0c7aecd69387e4de79bb19b7a668ef253e2da621de02352047a1cad7bb481f5b93b3c"

RPROVIDES:${PN} += "python3.9dist(lz4) \
python39-lz4 \
python39-lz4(aarch-64) \
python3dist(lz4)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblz4.so.1()(64bit) \
python(abi)"

inherit rpm

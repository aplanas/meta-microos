SUMMARY = "Cython bindings for MurmurHash"
DESCRIPTION = "Cython bindings for MurmurHash"
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python310-murmurhash-1.0.9-1.1.aarch64.rpm"
RPM_HASH = "411187e5e8591113c528bf3a4a18c25340882a8218be961a5da8f38c6015252127383e13c47aa5bea296f1eb45214ffeb90244ba7eead8f2285d42844748e11f"

RPROVIDES:${PN} += "python3.10dist-murmurhash \
python310-murmurhash \
python3dist-murmurhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

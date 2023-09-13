SUMMARY = "Cython bindings for MurmurHash"
DESCRIPTION = "Cython bindings for MurmurHash"
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python39-murmurhash-1.0.9-1.1.aarch64.rpm"
RPM_HASH = "5540aade755811288887038c28ba01dc2e02d542a7d965aa20dc0082644b8eb6275ec41d94945eb65ae1ad7a0328c04668478faf9b59235ceb641c3ab95c82de"

RPROVIDES:${PN} += "python3.9dist-murmurhash \
python39-murmurhash \
python3dist-murmurhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

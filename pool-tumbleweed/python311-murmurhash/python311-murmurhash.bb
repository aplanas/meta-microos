SUMMARY = "Cython bindings for MurmurHash"
DESCRIPTION = "Cython bindings for MurmurHash"
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python311-murmurhash-1.0.9-1.1.aarch64.rpm"
RPM_HASH = "7634b6c497c0ac2abe00f1fa5d6ae3a102c84c72eb24ad69c44f6b472ab86ece3aa72a9fa20618756bc6ec4ae0b97bc4a86bf3fc2e9566763842be68155fb2a5"

RPROVIDES:${PN} += "python3-murmurhash \
python3.11dist-murmurhash \
python311-murmurhash \
python3dist-murmurhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

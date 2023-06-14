SUMMARY = "Python binding for xxHash"
DESCRIPTION = "xxhash is a Python binding for the xxHash library."
LICENSE = "BSD-2-Clause"

PV = "3.1.0"

RPM_NAME = "python39-xxhash-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "d9d7de431c8b691a10b4488dae6337813841d23bdc9b7013fd33fea99c151cfa062ff32fa8ac04e0b72bd9622be60f65c3e965fc932b17300f9b0bc00ea134c8"

RPROVIDES:${PN} += "python3.9dist-xxhash \
python39-xxhash \
python3dist-xxhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxxhash.so.0 \
python-abi"

inherit rpm

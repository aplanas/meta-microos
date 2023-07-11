SUMMARY = "Bindings for scrypt"
DESCRIPTION = "Bindings for the scrypt key derivation function library."
LICENSE = "BSD-2-Clause"

PV = "0.8.20"

RPM_NAME = "python39-scrypt-0.8.20-2.3.aarch64.rpm"
RPM_HASH = "14d013cd47c005a31db2fc77a45288d9c31eb4c8d9975b437b87e004cd107f01a25a0bcefd3aac383e07cf0331fc737a06f5b67b446d3f58cce95b8a3a80b5bf"

RPROVIDES:${PN} += "python3.9dist-scrypt \
python39-scrypt \
python3dist-scrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi"

inherit rpm

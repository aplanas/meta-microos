SUMMARY = "LZ4 Bindings for Python"
DESCRIPTION = "This package provides python bindings for the lz4 compression library."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python39-lz4-4.3.2-2.3.aarch64.rpm"
RPM_HASH = "f774eb640a72947952b70752085707cece2188df8f879329a233f96137903487dea3ad2cd050f2299e7e711c29757751cbe1c6d7762583378a9445a701a51a95"

RPROVIDES:${PN} += "python3.9dist-lz4 \
python39-lz4 \
python3dist-lz4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
python-abi"

inherit rpm

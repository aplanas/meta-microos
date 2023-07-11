SUMMARY = "LZ4 Bindings for Python"
DESCRIPTION = "This package provides python bindings for the lz4 compression library."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python311-lz4-4.3.2-2.3.aarch64.rpm"
RPM_HASH = "accdf6aee800705ee8b0081ce4caa1a8e76ad336b7cb36c776b0814a5c1a8fa124ab76c3c8be669aa3dd019f8d1393e67afd40647fb8ddaadea1f1188674d35b"

RPROVIDES:${PN} += "python3-lz4 \
python3.11dist-lz4 \
python311-lz4 \
python3dist-lz4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
python-abi"

inherit rpm

SUMMARY = "ZSTD Bindings for Python"
DESCRIPTION = "ZSTD Bindings for Python."
LICENSE = "BSD-2-Clause"

PV = "1.5.5.1"

RPM_NAME = "python39-zstd-1.5.5.1-1.3.aarch64.rpm"
RPM_HASH = "d64678856c7ecaeda664978a3f787887919f8fafb4feae555af0e002c3d5b4d01a307a274ec3fa72168ae36f61971c0138b9849f3a4201ddfbf9bdcc9ea52264"

RPROVIDES:${PN} += "python3.9dist-zstd \
python39-zstd \
python3dist-zstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm

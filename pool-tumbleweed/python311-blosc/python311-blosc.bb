SUMMARY = "Blosc data compressor for Python"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data in \
Python."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "python311-blosc-1.11.1-2.2.aarch64.rpm"
RPM_HASH = "7e038208cb599d857b5c4f6df5e4340524f388894b7218d499bd6085a6a3a8afda20f51c3b8f4e073ca58002e6cf5ff68982639f2e01e78411e379ac7707a24f"

RPROVIDES:${PN} += "python3-blosc \
python3.11dist-blosc \
python311-blosc \
python3dist-blosc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
python-abi"

inherit rpm

SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "0.9.20"

RPM_NAME = "python310-aioquic-0.9.20-2.1.aarch64.rpm"
RPM_HASH = "2169332b559a2b2ca1a587d623c4c8ead2cead51f790763b72b9463b374d508d83a7557f2649b491f2b831c84a5d5ee4b1461866456c373e223c0897829adfc1"

RPROVIDES:${PN} += "python3.10dist-aioquic \
python310-aioquic \
python3dist-aioquic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi \
python310-certifi \
python310-cryptography \
python310-pyOpenSSL \
python310-pylsqpack"

inherit rpm

SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "0.9.21"

RPM_NAME = "python310-aioquic-0.9.21-1.1.aarch64.rpm"
RPM_HASH = "5b2d7fa965d962714355cf7ef19b85271ff48074cf9c724ec92a0ea4c7f8d581e04f4a02f7d353a94eb234f19c325c445e8f0dbdce68d1ec3de04f41d8ec5d54"

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

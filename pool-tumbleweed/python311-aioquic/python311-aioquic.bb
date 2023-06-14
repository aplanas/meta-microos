SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "0.9.20"

RPM_NAME = "python311-aioquic-0.9.20-1.5.aarch64.rpm"
RPM_HASH = "6df93464b43416a3081ce799866e95c743673d0aad0e9b81999006d981687b6f610aa50689d6a1b88118fc26c30c6797319bfe51336a9e2dec4bd8126d65db04"

RPROVIDES:${PN} += "python3.11dist-aioquic \
python311-aioquic \
python3dist-aioquic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi \
python311-certifi \
python311-cryptography \
python311-pyOpenSSL \
python311-pylsqpack"

inherit rpm

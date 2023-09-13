SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "0.9.21"

RPM_NAME = "python311-aioquic-0.9.21-1.1.aarch64.rpm"
RPM_HASH = "f128130ebefec18341336d887d8b7f78a7a89b6cdb5c7cfb917e1831ffe531311cf5d94b06e11f1bcbe8274a36f750b016a92874a662733fe325034a1c220e98"

RPROVIDES:${PN} += "python3-aioquic \
python3.11dist-aioquic \
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

SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "0.9.20"

RPM_NAME = "python39-aioquic-0.9.20-2.1.aarch64.rpm"
RPM_HASH = "ddbf0e14ecd4e01caf2ae0d247c4cd16f5d7fdf47a92297146e1a0817aacba23837bd2675bb2a4debbff62e4fe4abbcfe581dcbc0b987f0d70e43667ab9c2a04"

RPROVIDES:${PN} += "python3.9dist-aioquic \
python39-aioquic \
python3dist-aioquic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi \
python39-certifi \
python39-cryptography \
python39-pyOpenSSL \
python39-pylsqpack"

inherit rpm

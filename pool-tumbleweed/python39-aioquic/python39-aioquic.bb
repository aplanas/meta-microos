SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "0.9.21"

RPM_NAME = "python39-aioquic-0.9.21-1.1.aarch64.rpm"
RPM_HASH = "a61529bd9e9d41583a43ae977cff7b3ede97cd1a69781ce99296c0372b7ba68d3d857f1471efdc0649bf3fcafaa744e4257daea34a9c0aec384bf3b18dd4ac61"

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

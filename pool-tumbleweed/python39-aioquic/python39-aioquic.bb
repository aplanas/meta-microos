SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "0.9.20"

RPM_NAME = "python39-aioquic-0.9.20-1.5.aarch64.rpm"
RPM_HASH = "88f62ab11947232aba410dfbbd1f0aa3a3253d76a2703e803c1870814ca064d6f573c953ea2a7422cbe925f316ca4046882c82b6f9cad0bc2094150b00bf135c"

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

SUMMARY = "Python implementation of QUIC and HTTP/3"
DESCRIPTION = "A library for the QUIC network protocol in Python. It features a minimal TLS \
1.3 implementation, a QUIC stack and an HTTP/3 stack."
LICENSE = "BSD-3-Clause"

PV = "0.9.20"

RPM_NAME = "python311-aioquic-0.9.20-2.1.aarch64.rpm"
RPM_HASH = "3b85a644bb93f879d4291f440bb21e376bace49714772494aff498ace0eaba994beddb95e6d681820ddf76035ccdd6169fd886aefaa052f4bf103ea3a8cfa150"

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

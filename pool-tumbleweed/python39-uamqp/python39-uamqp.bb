SUMMARY = "AMQP 10 Client Library for Python"
DESCRIPTION = "AMQP 1.0 Client Library for Python"
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "python39-uamqp-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "5b7012351c9f93b3025af7ed968902f8def1b38b4d2913ae50255cd1f2de4dd5b25a4fb7ccf4cc7c661b9665ed5aa8da7164116d9d390c9ce96c7799eeb89da2"

RPROVIDES:${PN} += "python3.9dist-uamqp \
python39-uamqp \
python3dist-uamqp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python39-certifi"

inherit rpm

SUMMARY = "SASL for Python"
DESCRIPTION = "Cyrus-SASL bindings for Python."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python39-sasl-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "09fb614cd3b1bb5878e7edf80d6c454e564f8ddcb4fed6b300b5e3186fa6009b567a205ab8c1a056a79158ef7abfc87d9a89d02e7fd461d96f58aacc37794def"

RPROVIDES:${PN} += "python3.9dist-sasl \
python39-sasl \
python3dist-sasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsasl2.so.3 \
libstdc++.so.6 \
python-abi \
python39-six"

inherit rpm

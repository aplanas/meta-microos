SUMMARY = "SASL for Python"
DESCRIPTION = "Cyrus-SASL bindings for Python."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python39-sasl-0.3.1-1.4.aarch64.rpm"
RPM_HASH = "f289a7613b9b8be68fdb0d851ded4fbf95e1c640da6141bc86c85041963be1c8a8f5e65e283ebb739a886d7ae2ae91f7ce46c7c7dafe972aa0606a807ba24d9e"

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

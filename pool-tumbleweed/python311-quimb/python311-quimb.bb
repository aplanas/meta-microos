SUMMARY = "Python library for quantum information and many-body calculations"
DESCRIPTION = "quimb is an easy but fast python library for quantum information and \
many-body calculations, including with tensor networks."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python311-quimb-1.4.2-4.1.aarch64.rpm"
RPM_HASH = "5bbec17cf5415c5c6efb017dd460dfd80fb23b8fd23bafa1e314df0dc0c73afdf99429890f9d443ae1db9aa50844a18fbc8aad32757c09b009ec33c9dbdac290"

RPROVIDES:${PN} += "python3-quimb \
python3.11dist-quimb \
python311-quimb \
python3dist-quimb"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
python-abi \
python311-cytoolz \
python311-numba \
python311-numpy \
python311-opt-einsum \
python311-psutil \
python311-scipy \
python311-tqdm \
update-alternatives"

inherit rpm

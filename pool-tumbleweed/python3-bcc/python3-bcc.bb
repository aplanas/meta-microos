SUMMARY = "Python3 bindings for the BPF Compiler Collection"
DESCRIPTION = "Python 3.x bindings for the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python3-bcc-0.26.0-2.11.noarch.rpm"
RPM_HASH = "7aac5c29154dad2bfd72be59c3b7f63692c33a105761f2f1b33a10c7845d591b8f320a2e02edeea3b994ff7ef06c0b9f50f6df4c11ac1932203b39b2e1c77646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bcc \
python3.11dist-bcc \
python3dist-bcc"

RDEPENDS:${PN} += "libbcc0 \
python-abi"

inherit rpm

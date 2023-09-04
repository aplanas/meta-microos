SUMMARY = "Python3 bindings for the BPF Compiler Collection"
DESCRIPTION = "Python 3.x bindings for the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python3-bcc-0.26.0-2.12.noarch.rpm"
RPM_HASH = "a35f0165cc59bfa2014b349ee883771d588eb3103025da60a2e0f948b929000aed798f2d48a8fc7003d7af10ef0c5a9fbbb04643a765f33c9a4156804c2050dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bcc \
python3.11dist-bcc \
python3dist-bcc"

RDEPENDS:${PN} += "libbcc0 \
python-abi"

inherit rpm

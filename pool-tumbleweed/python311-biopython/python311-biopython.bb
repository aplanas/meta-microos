SUMMARY = "Python Tools for Computational Molecular Biology"
DESCRIPTION = "The Biopython Project is an international association of developers of freely \
available Python tools for computational molecular biology."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.81"

RPM_NAME = "python311-biopython-1.81-1.7.aarch64.rpm"
RPM_HASH = "edc36a4592ee6dd482c5567a67f3f6902c1c3024770705376f24d958e23d6e5b75c73739e11c497cc7b25c79efe1ffff1e4e0ae8fc3f004480db07385c6caa92"

RPROVIDES:${PN} += "python3-biopython \
python3.11dist-biopython \
python311-biopython \
python3dist-biopython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-numpy \
python311-xml"

inherit rpm

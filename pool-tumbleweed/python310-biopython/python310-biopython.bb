SUMMARY = "Python Tools for Computational Molecular Biology"
DESCRIPTION = "The Biopython Project is an international association of developers of freely \
available Python tools for computational molecular biology."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.81"

RPM_NAME = "python310-biopython-1.81-1.7.aarch64.rpm"
RPM_HASH = "d068d4f8edf6183f5142360a48796490aa8a61253d4bb8682f202fe61ce4760fdd349e36a868d01855f7415fd43e935f01f87c0b7f604e29acf1e7c6f6a03f98"

RPROVIDES:${PN} += "python3.10dist-biopython \
python310-biopython \
python3dist-biopython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-numpy \
python310-xml"

inherit rpm

SUMMARY = "Python Tools for Computational Molecular Biology"
DESCRIPTION = "The Biopython Project is an international association of developers of freely \
available Python tools for computational molecular biology."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.81"

RPM_NAME = "python39-biopython-1.81-1.7.aarch64.rpm"
RPM_HASH = "abbb9bd79194ceda4b292633ca62994f360ec06263a9a9d97aaa0b5de6a76e238012bd70b0483e1b0570ade4da720d354738ff5e91136f6a84ce0996ec5ca31e"

RPROVIDES:${PN} += "python3.9dist-biopython \
python39-biopython \
python3dist-biopython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-numpy \
python39-xml"

inherit rpm

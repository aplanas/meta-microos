SUMMARY = "Development files for python310-pomegranate"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed. \
 \
This package provides development files needed to run software that depends on \
Pomegranate."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python310-pomegranate-devel-0.12.0-2.13.aarch64.rpm"
RPM_HASH = "445ae84510e8532bf25ce4dbe0cdc8d679c4917d0e3cb17f1944ffd6f7dfce6f85f66781b3e28ef01bee0d864b6a8874c316e6e4edaa0047f939e1cbbb5b9c16"

RPROVIDES:${PN} += "python3-pomegranate-devel \
python310-pomegranate-devel \
python310-pomegranate-devel(aarch-64)"

RDEPENDS:${PN} += "python310-pomegranate"

inherit rpm

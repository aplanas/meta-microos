SUMMARY = "Development files for python39-pomegranate"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed. \
 \
This package provides development files needed to run software that depends on \
Pomegranate."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python39-pomegranate-devel-0.12.0-2.13.aarch64.rpm"
RPM_HASH = "b1da91e2bbcea501c3b11391b9bc0b96994891e4a09bd40fa7cb11b3d90b5986f3c39232c8b5cee76e55484ce1822eeb8f1f27832c559d39021435b8905db8dd"

RPROVIDES:${PN} += "python39-pomegranate-devel"

RDEPENDS:${PN} += "python39-pomegranate"

inherit rpm

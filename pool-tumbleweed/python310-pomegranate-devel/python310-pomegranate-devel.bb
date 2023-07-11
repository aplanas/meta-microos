SUMMARY = "Development files for python310-pomegranate"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed. \
 \
This package provides development files needed to run software that depends on \
Pomegranate."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python310-pomegranate-devel-0.12.0-2.15.aarch64.rpm"
RPM_HASH = "7075d3676a65dd9095b1a4c9e997184edd2856b17787b21971bd711e34c0a2495f37599390d46aa811803c90d73981267ee009ccad39847ce8e9a694c743080b"

RPROVIDES:${PN} += "python310-pomegranate-devel"

RDEPENDS:${PN} += "python310-pomegranate"

inherit rpm

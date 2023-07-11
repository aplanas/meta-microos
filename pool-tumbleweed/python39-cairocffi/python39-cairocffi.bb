SUMMARY = "Python cairo bindings based on cffi"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python39-cairocffi-1.5.1-1.3.noarch.rpm"
RPM_HASH = "537a2ed5786482f1999eb9c6ab1927a5e29b370aada7fd1fdafd22fa6d36814b4dba1a051c9eb82df7f2fc5f923ccfb4499ba7e0bf3f72393d95e5fdb0e44434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cairocffi \
python39-cairocffi \
python3dist-cairocffi"

RDEPENDS:${PN} += "cairo \
python-abi \
python39-cffi \
python39-xcffib"

inherit rpm

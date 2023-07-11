SUMMARY = "Python cairo bindings based on cffi"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python310-cairocffi-1.5.1-1.3.noarch.rpm"
RPM_HASH = "9ea4d72c72c3d5aa0e61c9ca4d9486aaa9622e9516601ba4489b01d1da574c17b2fc3c3e7912cb64160a956a926a5c668fd9bc96ce67a3de4893ea75498f4b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cairocffi \
python310-cairocffi \
python3dist-cairocffi"

RDEPENDS:${PN} += "cairo \
python-abi \
python310-cffi \
python310-xcffib"

inherit rpm

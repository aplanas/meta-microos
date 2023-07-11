SUMMARY = "Python cairo bindings based on cffi"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python311-cairocffi-1.5.1-1.3.noarch.rpm"
RPM_HASH = "4842bb3500af9b763086714eab59f788195f41c6583fd9cc3954c68ee84c36e9cd7ea543e476b0d1e1fbadd73eaea62320a37a3f9e0cb76d5deedb69fa892152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cairocffi \
python3.11dist-cairocffi \
python311-cairocffi \
python3dist-cairocffi"

RDEPENDS:${PN} += "cairo \
python-abi \
python311-cffi \
python311-xcffib"

inherit rpm

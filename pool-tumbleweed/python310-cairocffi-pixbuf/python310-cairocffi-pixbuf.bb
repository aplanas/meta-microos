SUMMARY = "Python cairo bindings based on cffi - pixbuf image loader"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output. \
 \
This package provides the optional gdk-pixbuf image loader module."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python310-cairocffi-pixbuf-1.5.1-1.1.noarch.rpm"
RPM_HASH = "6d9b761769afba320d4da12eaaac9671df920cd9ecc379409b008be917933ea02a724e50118897948654da05ab8c8e598b4d399bcd6b0f42c4d8cee4351498cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cairocffi-pixbuf \
python310-cairocffi-pixbuf"

RDEPENDS:${PN} += "gdk-pixbuf \
python-abi \
python310-cairocffi"

inherit rpm

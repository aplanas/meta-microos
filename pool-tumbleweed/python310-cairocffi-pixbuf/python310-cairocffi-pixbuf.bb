SUMMARY = "Python cairo bindings based on cffi - pixbuf image loader"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output. \
 \
This package provides the optional gdk-pixbuf image loader module."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python310-cairocffi-pixbuf-1.5.1-1.3.noarch.rpm"
RPM_HASH = "0aba610c6228414c6c06544a4063a719609290f0704b1a24589388f89c6ee731fc5ce83a14e3562cd18b899448e540b34305734cb3979895e666259ab20c1e0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-cairocffi-pixbuf"

RDEPENDS:${PN} += "gdk-pixbuf \
python-abi \
python310-cairocffi"

inherit rpm

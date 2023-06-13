SUMMARY = "Python cairo bindings based on cffi - pixbuf image loader"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output. \
 \
This package provides the optional gdk-pixbuf image loader module."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python311-cairocffi-pixbuf-1.5.1-1.1.noarch.rpm"
RPM_HASH = "5e18c5eaebe259c9aa08497edb1bbcd2ee82f848a80234dc14eb659429d01b7fe43054e7cf86b25e2bab26b8cccfdfe2076e61dbc45b681f98c6ad5a0cde3c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-cairocffi-pixbuf"

RDEPENDS:${PN} += "gdk-pixbuf \
python(abi) \
python311-cairocffi"

inherit rpm

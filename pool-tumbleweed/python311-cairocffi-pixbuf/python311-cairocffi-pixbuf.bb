SUMMARY = "Python cairo bindings based on cffi - pixbuf image loader"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output. \
 \
This package provides the optional gdk-pixbuf image loader module."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python311-cairocffi-pixbuf-1.5.1-1.3.noarch.rpm"
RPM_HASH = "ce06d278294c0910edd57e628fcbe2896e17d9dcdbb915aacd8b1faf6427682846134985fb1dc6122e6f9362e5815249a6f13b142688bf2519b7e7ca992d2986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cairocffi-pixbuf \
python311-cairocffi-pixbuf"

RDEPENDS:${PN} += "gdk-pixbuf \
python-abi \
python311-cairocffi"

inherit rpm

SUMMARY = "Python cairo bindings based on cffi - pixbuf image loader"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output. \
 \
This package provides the optional gdk-pixbuf image loader module."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python39-cairocffi-pixbuf-1.5.1-1.3.noarch.rpm"
RPM_HASH = "5b4e8293766f73a4788b8fe0d727b447ab37c8818ad0af28c34854c545483d62ef0bbbc492c77071615e9465d103b1c74f0a995f4b285b3c041ef935ada928ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-cairocffi-pixbuf"

RDEPENDS:${PN} += "gdk-pixbuf \
python-abi \
python39-cairocffi"

inherit rpm

SUMMARY = "Python cairo bindings based on cffi"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python39-cairocffi-1.5.1-1.1.noarch.rpm"
RPM_HASH = "aa6ec3a0e5361e1ae78e4f5a15a3e1cd1c2d7e3544d5893d316cda8d2785a7d64e8d2b0e26d466fdd71eabab562daaa91a7cf35022c56ca99a8d6f63c2e53351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cairocffi) \
python39-cairocffi \
python3dist(cairocffi)"

RDEPENDS:${PN} += "cairo \
python(abi) \
python39-cffi \
python39-xcffib"

inherit rpm

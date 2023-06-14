SUMMARY = "Python cairo bindings based on cffi"
DESCRIPTION = "cairocffi is a CFFI-based drop-in replacement for Pycairo, \
a set of Python bindings and object-oriented API for cairo. \
Cairo is a 2D vector graphics library with support for multiple backends \
including image buffers, PNG, PostScript, PDF, and SVG file output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "python311-cairocffi-1.5.1-1.1.noarch.rpm"
RPM_HASH = "6581b84f297bb7a1efb8aaf6de6cd4188ed1ba25f5876d274ae93c615eb4630df00b4b4c7d253e4617854ecfa44681ca53fe9a47c41b32124495b503d74197af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cairocffi \
python311-cairocffi \
python3dist-cairocffi"

RDEPENDS:${PN} += "cairo \
python-abi \
python311-cffi \
python311-xcffib"

inherit rpm

SUMMARY = "Documentation for python-pygraphviz"
DESCRIPTION = "This package provides documentation and help files for python-pygraphviz"
LICENSE = "BSD-3-Clause"

PV = "1.11"

RPM_NAME = "python-pygraphviz-doc-1.11-1.1.aarch64.rpm"
RPM_HASH = "b2286749cdf34dd51ae2c802a305f0573d779e499faa01319c5331968fe5a0f1154f77ffd7156995e0a11a79ccd9a21f8c2e997b8e3efbe8ff208a8b535fe274"

RPROVIDES:${PN} += "python-pygraphviz-doc \
python310-pygraphviz-doc \
python311-pygraphviz-doc \
python39-pygraphviz-doc"

RDEPENDS:${PN} += ""

inherit rpm

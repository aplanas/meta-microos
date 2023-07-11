SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "python311-sphinxcontrib-apidoc-0.3.0-2.3.noarch.rpm"
RPM_HASH = "432d15d26bea82440e17344d495e029320df44284a0aafede1d9ce278c36c1e3b469825c3826c643a0bb983e2a15fc27a5906d951462617d53187666a4a58dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-apidoc \
python3.11dist-sphinxcontrib-apidoc \
python311-sphinxcontrib-apidoc \
python3dist-sphinxcontrib-apidoc"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-pbr"

inherit rpm

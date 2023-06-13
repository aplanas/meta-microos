SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "python310-sphinxcontrib-apidoc-0.3.0-2.1.noarch.rpm"
RPM_HASH = "a1212ad2c7e8acbcab0d4d4f91657363211a15dd8e3d8b16f82ef721fbf833e7dd5886cc948ca182c1c0847627a4bdca263753fc2f6b210f421e4e0b08249f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-apidoc \
python3.10dist(sphinxcontrib-apidoc) \
python310-sphinxcontrib-apidoc \
python3dist(sphinxcontrib-apidoc)"

RDEPENDS:${PN} += "python(abi) \
python310-Sphinx \
python310-pbr"

inherit rpm

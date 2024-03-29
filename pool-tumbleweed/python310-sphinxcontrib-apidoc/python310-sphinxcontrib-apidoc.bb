SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "python310-sphinxcontrib-apidoc-0.3.0-3.1.noarch.rpm"
RPM_HASH = "5ea4b7a053d5eca18348eca368d2aa8c05b48217238ae06fb09e33ee3803c8c3fcebb7ccedd931bf41e6d9552d60c2881871685a8adcd14673c117acd04193ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-apidoc \
python310-sphinxcontrib-apidoc \
python3dist-sphinxcontrib-apidoc"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-pbr"

inherit rpm

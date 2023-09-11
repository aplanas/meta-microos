SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "python39-sphinxcontrib-apidoc-0.3.0-3.1.noarch.rpm"
RPM_HASH = "2debe283fa64c72a4f38ff0c211108d8f17693f72e954a70df8b80fa22b5f710f9c92b95070738034c0a2f0b4c84e57159a6e952d63db9b0973a62fafb071dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-apidoc \
python39-sphinxcontrib-apidoc \
python3dist-sphinxcontrib-apidoc"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-pbr"

inherit rpm

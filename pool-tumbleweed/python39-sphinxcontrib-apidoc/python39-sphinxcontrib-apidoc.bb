SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "python39-sphinxcontrib-apidoc-0.3.0-2.3.noarch.rpm"
RPM_HASH = "886e7ddfb9b16ab9475dc3236d13e8385dffb2ad710c55723df6f4c4429844d82bb7b23754ed8d762c49a6caba1a856a1fa6e48405af7e14297941b074ed03fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-apidoc \
python39-sphinxcontrib-apidoc \
python3dist-sphinxcontrib-apidoc"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-pbr"

inherit rpm

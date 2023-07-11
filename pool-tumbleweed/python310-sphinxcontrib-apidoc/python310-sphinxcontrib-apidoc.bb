SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "python310-sphinxcontrib-apidoc-0.3.0-2.3.noarch.rpm"
RPM_HASH = "26c3b85cc339e1a5b74dee09ed057b60246cd60970936fbd0872d31fff4e3cda927d2ae0d7be075a57b0074de63da4b5f9bc7b7f502de4c0943e53796d7fd044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-apidoc \
python310-sphinxcontrib-apidoc \
python3dist-sphinxcontrib-apidoc"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-pbr"

inherit rpm

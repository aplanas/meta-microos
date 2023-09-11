SUMMARY = "A Sphinx extension for running 'sphinx-apidoc' on each build"
DESCRIPTION = "*sphinx-apidoc* is a tool for automatic generation of Sphinx sources that, \
using the `autodoc <sphinx_autodoc>`_ extension, documents a whole package in \
the style of other automatic API documentation tools. *sphinx-apidoc* does not \
actually build documentation - rather it simply generates it. As a result, it \
must be run before *sphinx-build*."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "python311-sphinxcontrib-apidoc-0.3.0-3.1.noarch.rpm"
RPM_HASH = "c8506f1cfd1414978d583fa82bd2145aaa1c02bf446480ab37749e29e3a4401b88f46d6ed3b4f5bca283759292727b2fb3110a73da54fa2a84d05370f8d127c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-apidoc \
python3.11dist-sphinxcontrib-apidoc \
python311-sphinxcontrib-apidoc \
python3dist-sphinxcontrib-apidoc"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-pbr"

inherit rpm

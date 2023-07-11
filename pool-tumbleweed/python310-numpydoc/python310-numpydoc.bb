SUMMARY = "Sphinx extension to support docstrings in Numpy format"
DESCRIPTION = "Numpy's documentation uses several custom extensions to Sphinx.  These \
are shipped in this numpydoc package, in case you want to make use \
of them in third-party projects."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python310-numpydoc-1.5.0-1.5.noarch.rpm"
RPM_HASH = "c12743959ddf472756285ef1af238500f56f15e203ff7c2d600358f8adce8aa6196f567aa3b2e82d36b4207181c435563c9bbc9a8ef79dc833f4eda3ff2428e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-numpydoc \
python310-numpydoc \
python3dist-numpydoc"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-Sphinx"

inherit rpm

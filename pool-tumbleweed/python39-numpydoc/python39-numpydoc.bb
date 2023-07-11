SUMMARY = "Sphinx extension to support docstrings in Numpy format"
DESCRIPTION = "Numpy's documentation uses several custom extensions to Sphinx.  These \
are shipped in this numpydoc package, in case you want to make use \
of them in third-party projects."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python39-numpydoc-1.5.0-1.5.noarch.rpm"
RPM_HASH = "a2d90731b326de3adb056752e03c7f2c131ea8c15e597dadc908e383ccc02deae5d3e05accc9e209385575a0157ea29794ea763d2a95e7939d62159c176dea78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-numpydoc \
python39-numpydoc \
python3dist-numpydoc"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-Sphinx"

inherit rpm

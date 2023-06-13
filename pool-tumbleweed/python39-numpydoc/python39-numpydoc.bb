SUMMARY = "Sphinx extension to support docstrings in Numpy format"
DESCRIPTION = "Numpy's documentation uses several custom extensions to Sphinx.  These \
are shipped in this numpydoc package, in case you want to make use \
of them in third-party projects."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python39-numpydoc-1.5.0-1.3.noarch.rpm"
RPM_HASH = "4a04ecca25b3ae4ca46580d990c786c9ac12c5b275d3d6d01288593c482a98f19a19a688c93fec6a26a695c9efabc6c707b2996304bd3809364b856a651ee085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(numpydoc) \
python39-numpydoc \
python3dist(numpydoc)"

RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-Sphinx"

inherit rpm

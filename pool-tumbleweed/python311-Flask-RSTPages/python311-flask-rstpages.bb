SUMMARY = "Support for reStructuredText in Flask applications"
DESCRIPTION = "Flask-RSTPages adds support for reStructuredText to Flask applications. \
See the docs for details: http://flask-rstpages.readthedocs.org/"
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python311-Flask-RSTPages-0.3-2.16.noarch.rpm"
RPM_HASH = "ea8f6a6f5a8750ed4087ff5a1624f77c0a3d3d96e5c79de8cca48c372c8ad5a9196753c2f23493526a25bfa3cf9757f3ed86b20c85bebbfe5426187fae557be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-rstpages) \
python311-Flask-RSTPages \
python3dist(flask-rstpages)"

RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-Pygments \
python311-docutils"

inherit rpm

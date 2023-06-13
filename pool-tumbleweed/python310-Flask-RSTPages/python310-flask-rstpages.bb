SUMMARY = "Support for reStructuredText in Flask applications"
DESCRIPTION = "Flask-RSTPages adds support for reStructuredText to Flask applications. \
See the docs for details: http://flask-rstpages.readthedocs.org/"
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python310-Flask-RSTPages-0.3-2.16.noarch.rpm"
RPM_HASH = "4fe9c9d69573ba1047618b80966a59c913836ace27794cdf2a841b3847c8d6724d0f853d708dffcfa7371f6adb71e98d21685842c146eaac1bf8e4e3d33f866a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-RSTPages \
python3.10dist(flask-rstpages) \
python310-Flask-RSTPages \
python3dist(flask-rstpages)"

RDEPENDS:${PN} += "python(abi) \
python310-Flask \
python310-Pygments \
python310-docutils"

inherit rpm

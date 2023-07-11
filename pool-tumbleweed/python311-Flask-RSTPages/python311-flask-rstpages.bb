SUMMARY = "Support for reStructuredText in Flask applications"
DESCRIPTION = "Flask-RSTPages adds support for reStructuredText to Flask applications. \
See the docs for details: http://flask-rstpages.readthedocs.org/"
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python311-Flask-RSTPages-0.3-2.17.noarch.rpm"
RPM_HASH = "5ecc61d53df62f092ba17a53629202043cd0a8f71f91d7f5252df1d0343a78d007a7318bd591ddfb622d97bde26bd7a87fe1f6ad0652f55ddde4ee5e73f5eef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-RSTPages \
python3.11dist-flask-rstpages \
python311-Flask-RSTPages \
python3dist-flask-rstpages"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-Pygments \
python311-docutils"

inherit rpm

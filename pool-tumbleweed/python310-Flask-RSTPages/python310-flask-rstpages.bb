SUMMARY = "Support for reStructuredText in Flask applications"
DESCRIPTION = "Flask-RSTPages adds support for reStructuredText to Flask applications. \
See the docs for details: http://flask-rstpages.readthedocs.org/"
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python310-Flask-RSTPages-0.3-2.17.noarch.rpm"
RPM_HASH = "64ea50aa790989b3c5785c092865a14a578bf37c4d18c74f56e3aa4f767d64c9b9b255bb0520d47a353fba0762ac67a481d5288b72c5d0e68be0398ec9a066ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-rstpages \
python310-Flask-RSTPages \
python3dist-flask-rstpages"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-Pygments \
python310-docutils"

inherit rpm

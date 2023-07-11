SUMMARY = "Support for reStructuredText in Flask applications"
DESCRIPTION = "Flask-RSTPages adds support for reStructuredText to Flask applications. \
See the docs for details: http://flask-rstpages.readthedocs.org/"
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python39-Flask-RSTPages-0.3-2.17.noarch.rpm"
RPM_HASH = "b59163f84db6fa061e8b3b4f3bed6fe27045c132236c984ea0ae6ed0884b6939af83562ed4174ceda4c6f7fad76102f1635b37cd3e949cbf6f6b96b3290b488a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-rstpages \
python39-Flask-RSTPages \
python3dist-flask-rstpages"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-Pygments \
python39-docutils"

inherit rpm

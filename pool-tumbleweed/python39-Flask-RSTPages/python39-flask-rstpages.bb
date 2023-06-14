SUMMARY = "Support for reStructuredText in Flask applications"
DESCRIPTION = "Flask-RSTPages adds support for reStructuredText to Flask applications. \
See the docs for details: http://flask-rstpages.readthedocs.org/"
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python39-Flask-RSTPages-0.3-2.16.noarch.rpm"
RPM_HASH = "701e62ca36c9cafaa7303356782f78e44a5186eaa36bc8a6c734af22e04d80e20115fc63935ec826195f9f45b0462fc2e47b20f2f9dbe935151d5fa68595e2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-rstpages \
python39-Flask-RSTPages \
python3dist-flask-rstpages"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-Pygments \
python39-docutils"

inherit rpm

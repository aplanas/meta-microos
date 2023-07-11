SUMMARY = "Unit testing for Flask"
DESCRIPTION = "Unit testing for Flask."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python39-Flask-Testing-0.8.1-4.5.noarch.rpm"
RPM_HASH = "2e2953cefaa810a73d810216b182c4a4cebfba5cd898e3107105688ce4dd71b6fbf5b6bf06c44ba8a4a87ef5c99f1bf4a4109eb4621036800aae2ae49ea11b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-testing \
python39-Flask-Testing \
python3dist-flask-testing"

RDEPENDS:${PN} += "python-abi \
python39-Flask"

inherit rpm

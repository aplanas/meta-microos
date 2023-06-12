SUMMARY = "Unit testing for Flask"
DESCRIPTION = "Unit testing for Flask."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python39-Flask-Testing-0.8.1-4.3.noarch.rpm"
RPM_HASH = "0fa77cfcbb86a6924393a027adec8f0c92595b6d076efc29aa83ed5243b46fe3ef2f745fc8026148141de8f4ca2e3b873fd45e7e9122b7daa7820f04ea80e584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-testing) \
python39-Flask-Testing \
python3dist(flask-testing)"
RDEPENDS:${PN} += "python(abi) \
python39-Flask"

inherit rpm

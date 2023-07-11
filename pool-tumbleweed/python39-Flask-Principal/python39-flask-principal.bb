SUMMARY = "Identity management for flask"
DESCRIPTION = "Flask-Principal provides a very loose framework to tie in providers of \
two types of services, often located in different parts of a web application: \
Authentication providers and User information providers."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-Flask-Principal-0.4.0-3.10.noarch.rpm"
RPM_HASH = "2031496d25bb38f1731ad011de6d7f4583af684925bc4995f85efe573067d84a0060f635551177e8f4fe7147ce855dc7fa05b56f719d131ad43f747b84712c69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-principal \
python39-Flask-Principal \
python3dist-flask-principal"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-blinker"

inherit rpm

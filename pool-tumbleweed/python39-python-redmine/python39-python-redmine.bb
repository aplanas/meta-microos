SUMMARY = "Python library for the Redmine RESTful API"
DESCRIPTION = "Python Redmine is a library for communicating with a Redmine \
project management application. Redmine exposes some of it's data \
via REST API for which Python Redmine provides a simple but \
powerful Pythonic API inspired by a well-known Django ORM."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python39-python-redmine-2.4.0-1.5.noarch.rpm"
RPM_HASH = "6b1d1815da0b0f493bea7f56e0194efb6bdc5e235e69845a5258cd39d68e70a98bac86055e25c229478e0c03994233ed091de63c70f830ec4dd0f24b7708065b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-redmine \
python39-python-redmine \
python3dist-python-redmine"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm

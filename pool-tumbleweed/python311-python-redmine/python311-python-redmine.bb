SUMMARY = "Python library for the Redmine RESTful API"
DESCRIPTION = "Python Redmine is a library for communicating with a Redmine \
project management application. Redmine exposes some of it's data \
via REST API for which Python Redmine provides a simple but \
powerful Pythonic API inspired by a well-known Django ORM."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python311-python-redmine-2.4.0-1.5.noarch.rpm"
RPM_HASH = "3b0978a0b71690926786c0702c4d9efbb6e4666799843d52b75149365e3ac5d532425e7ac789450334216a1e2b51e356f6f64340b922c28490f6825ce6770740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-redmine \
python3.11dist-python-redmine \
python311-python-redmine \
python3dist-python-redmine"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm

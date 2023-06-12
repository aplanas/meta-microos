SUMMARY = "Python library for the Redmine RESTful API"
DESCRIPTION = "Python Redmine is a library for communicating with a Redmine \
project management application. Redmine exposes some of it's data \
via REST API for which Python Redmine provides a simple but \
powerful Pythonic API inspired by a well-known Django ORM."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python39-python-redmine-2.4.0-1.3.noarch.rpm"
RPM_HASH = "06791fb7611f8c33cf8b5b4c5e88d202d8c51a855d9755f3c5c865bd318e8ef2dc6d9f273a9d3900bf99f50287656e9ee7513289cd59c8d79ea4008de8dd0540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-redmine) \
python39-python-redmine \
python3dist(python-redmine)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm

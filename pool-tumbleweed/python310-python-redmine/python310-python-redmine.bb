SUMMARY = "Python library for the Redmine RESTful API"
DESCRIPTION = "Python Redmine is a library for communicating with a Redmine \
project management application. Redmine exposes some of it's data \
via REST API for which Python Redmine provides a simple but \
powerful Pythonic API inspired by a well-known Django ORM."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python310-python-redmine-2.4.0-1.5.noarch.rpm"
RPM_HASH = "9c17d2feb17c9de49f81a99235b1f96d3b81e3efa6876fe579c9071e22333324996880d3b8e08ee8870a464d7a30db49976f69a53e0ea82ec0385d12f2b01a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-redmine \
python310-python-redmine \
python3dist-python-redmine"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm

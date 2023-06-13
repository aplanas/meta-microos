SUMMARY = "Python library for the Redmine RESTful API"
DESCRIPTION = "Python Redmine is a library for communicating with a Redmine \
project management application. Redmine exposes some of it's data \
via REST API for which Python Redmine provides a simple but \
powerful Pythonic API inspired by a well-known Django ORM."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python311-python-redmine-2.4.0-1.3.noarch.rpm"
RPM_HASH = "084576b33050fecf7727f45d79049be940734d62a16da372b52687814702b1ed1028a34480b142e40643c6a5125723714bd14efec66e8d0f21c8211aa3e0522f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-redmine) \
python311-python-redmine \
python3dist(python-redmine)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm

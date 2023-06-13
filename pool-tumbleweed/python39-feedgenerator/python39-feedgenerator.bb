SUMMARY = "Standalone version of django.utilsfeedgenerator, compatible with Py3k"
DESCRIPTION = "FeedGenerator is a standalone version of Django’s feedgenerator module. \
It has evolved over time and includes numerous enhancements."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-feedgenerator-2.1.0-1.1.noarch.rpm"
RPM_HASH = "50b35da141bbcab65552c0a3da85fa4ba12800deb23103b4712e35eba102ef3f94a375fd5dd750ec757170ad6c3eca341e4d9ee2680eaf3f92f793340c454642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(feedgenerator) \
python39-feedgenerator \
python3dist(feedgenerator)"

RDEPENDS:${PN} += "python(abi) \
python39-pytz"

inherit rpm

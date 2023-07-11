SUMMARY = "Standalone version of django.utilsfeedgenerator, compatible with Py3k"
DESCRIPTION = "FeedGenerator is a standalone version of Django’s feedgenerator module. \
It has evolved over time and includes numerous enhancements."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-feedgenerator-2.1.0-1.3.noarch.rpm"
RPM_HASH = "a385de506c58acd39c6555c31cdd51f41871fb622159ff4e747713d4c694d764690335b3bbdc63e70b0cf44578a70463e42a687f287b564222e8878218da811b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-feedgenerator \
python39-feedgenerator \
python3dist-feedgenerator"

RDEPENDS:${PN} += "python-abi \
python39-pytz"

inherit rpm

SUMMARY = "Standalone version of django.utilsfeedgenerator, compatible with Py3k"
DESCRIPTION = "FeedGenerator is a standalone version of Django’s feedgenerator module. \
It has evolved over time and includes numerous enhancements."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-feedgenerator-2.1.0-1.1.noarch.rpm"
RPM_HASH = "1e9b30fcc6524759cfcbca4840a784590ea259da6f8bcf2c500a8d208641bd1e37b68f8b322efd181bfe5e17aca54c453f6a197caf899b66b4de44a0d538ec39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(feedgenerator) \
python311-feedgenerator \
python3dist(feedgenerator)"

RDEPENDS:${PN} += "python(abi) \
python311-pytz"

inherit rpm

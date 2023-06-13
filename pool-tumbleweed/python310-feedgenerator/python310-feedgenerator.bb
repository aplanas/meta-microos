SUMMARY = "Standalone version of django.utilsfeedgenerator, compatible with Py3k"
DESCRIPTION = "FeedGenerator is a standalone version of Django’s feedgenerator module. \
It has evolved over time and includes numerous enhancements."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-feedgenerator-2.1.0-1.1.noarch.rpm"
RPM_HASH = "d7ca9fc93a75d725ec985692013ee729123c677ea060b6b9c820ba93cb47842ac4c1c4f2673282448d6d0a85910e06801d0b26526823752f6deccf14928feea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedgenerator \
python3.10dist(feedgenerator) \
python310-feedgenerator \
python3dist(feedgenerator)"

RDEPENDS:${PN} += "python(abi) \
python310-pytz"

inherit rpm

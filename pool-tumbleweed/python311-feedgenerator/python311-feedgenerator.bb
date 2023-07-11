SUMMARY = "Standalone version of django.utilsfeedgenerator, compatible with Py3k"
DESCRIPTION = "FeedGenerator is a standalone version of Django’s feedgenerator module. \
It has evolved over time and includes numerous enhancements."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-feedgenerator-2.1.0-1.3.noarch.rpm"
RPM_HASH = "48b2f06f09f277bdea280e4523c8674256a93e0fff436e0554c5e91dfa9da2fe5dd2a4407b1c752a36abde2805b464fe598287fd7e47399bb176460a2bb21192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedgenerator \
python3.11dist-feedgenerator \
python311-feedgenerator \
python3dist-feedgenerator"

RDEPENDS:${PN} += "python-abi \
python311-pytz"

inherit rpm

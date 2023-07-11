SUMMARY = "Standalone version of django.utilsfeedgenerator, compatible with Py3k"
DESCRIPTION = "FeedGenerator is a standalone version of Django’s feedgenerator module. \
It has evolved over time and includes numerous enhancements."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-feedgenerator-2.1.0-1.3.noarch.rpm"
RPM_HASH = "da100c3ba6f19f5db13e024c11022260ef7cbd40821d2cbca9b7815169bca22cd0f8c4372c471e9695691b489c136635325191e6447a2440a4c8349136c06fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-feedgenerator \
python310-feedgenerator \
python3dist-feedgenerator"

RDEPENDS:${PN} += "python-abi \
python310-pytz"

inherit rpm

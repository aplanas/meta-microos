SUMMARY = "A review helper script for openQA"
DESCRIPTION = "A review helper script for openQA. For more details look into the README file."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "python3-openqa_review-1.30.0-1.4.noarch.rpm"
RPM_HASH = "b67d34bb24d00676b75f755a3d071bbb88a0ce41aae659c76ac9c5983b24cb94dcffde08bab52d04de2ff083287ec5b218faf8bc56d3954c751588f1f1a75d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openqa-review \
python3.11dist-openqa-review \
python3dist-openqa-review"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-PyYAML \
python3-beautifulsoup4 \
python3-certifi \
python3-future \
python3-humanfriendly \
python3-pika \
python3-requests \
python3-setuptools \
python3-sortedcontainers \
update-alternatives"

inherit rpm

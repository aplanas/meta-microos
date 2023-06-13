SUMMARY = "Camel case JSON support for Django REST framework"
DESCRIPTION = "Camel case JSON support for Django REST framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python39-djangorestframework-camel-case-1.4.2-1.3.noarch.rpm"
RPM_HASH = "8bcd27c58f6d6a8488105321d8017c0deacd7256b2b546a4bbf02a694efcc9cb3e1efc20d7174e494294284bc734a2dda23cf4e312fb570c7502b8bab2d84577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(djangorestframework-camel-case) \
python39-djangorestframework-camel-case \
python3dist(djangorestframework-camel-case)"

RDEPENDS:${PN} += "python(abi) \
python39-djangorestframework"

inherit rpm

SUMMARY = "Camel case JSON support for Django REST framework"
DESCRIPTION = "Camel case JSON support for Django REST framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python311-djangorestframework-camel-case-1.4.2-1.5.noarch.rpm"
RPM_HASH = "a882ba4ea850f520126e470e2797490443d21b255fa27dde82e49a530134595263e9e1584ec98fca340e02d9ea554ad314c6fde8c0fc8054488d21f11fd0ac3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djangorestframework-camel-case \
python3.11dist-djangorestframework-camel-case \
python311-djangorestframework-camel-case \
python3dist-djangorestframework-camel-case"

RDEPENDS:${PN} += "python-abi \
python311-djangorestframework"

inherit rpm

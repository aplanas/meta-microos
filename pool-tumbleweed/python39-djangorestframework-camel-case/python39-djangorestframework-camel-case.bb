SUMMARY = "Camel case JSON support for Django REST framework"
DESCRIPTION = "Camel case JSON support for Django REST framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python39-djangorestframework-camel-case-1.4.2-1.5.noarch.rpm"
RPM_HASH = "07b6269bee7baffeb181041adb11aef43d2562125a1556b44e5f00cf7f0a56fd4b8da2089c89727e3901ddcbce283ed03fe511d4fb7774f97e92e55713900e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-djangorestframework-camel-case \
python39-djangorestframework-camel-case \
python3dist-djangorestframework-camel-case"

RDEPENDS:${PN} += "python-abi \
python39-djangorestframework"

inherit rpm

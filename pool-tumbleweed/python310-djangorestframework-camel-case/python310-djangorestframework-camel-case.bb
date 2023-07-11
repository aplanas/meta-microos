SUMMARY = "Camel case JSON support for Django REST framework"
DESCRIPTION = "Camel case JSON support for Django REST framework."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python310-djangorestframework-camel-case-1.4.2-1.5.noarch.rpm"
RPM_HASH = "0f3cbeb567ba516593615827b8007e459549593ad9bbabfdf961412f1d3b6bf0476afec960ef39ec93cc243f3ed80b677ffa1bd9b13e523743562adbfc999d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-djangorestframework-camel-case \
python310-djangorestframework-camel-case \
python3dist-djangorestframework-camel-case"

RDEPENDS:${PN} += "python-abi \
python310-djangorestframework"

inherit rpm

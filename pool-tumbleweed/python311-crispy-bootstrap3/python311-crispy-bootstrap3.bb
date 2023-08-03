SUMMARY = "Bootstrap3 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap3 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2022.1"

RPM_NAME = "python311-crispy-bootstrap3-2022.1-1.1.noarch.rpm"
RPM_HASH = "f78b8d14a75223951ccc6375a5c4982c1df2501e8581a27b741db3e4a29bb1f950194e4be4f6b34d39cc9d03437170710fe61f655b697ab7c9e17b95bae48ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crispy-bootstrap3 \
python3.11dist-crispy-bootstrap3 \
python311-crispy-bootstrap3 \
python3dist-crispy-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-crispy-forms"

inherit rpm

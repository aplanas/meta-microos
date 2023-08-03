SUMMARY = "Bootstrap3 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap3 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2022.1"

RPM_NAME = "python310-crispy-bootstrap3-2022.1-1.1.noarch.rpm"
RPM_HASH = "2ca7f8a5fe1570f6dc58e785ec4d9f81e2b3fca0d1100ac948321318af7c7ab71efd78fd4518954e07ccde9bbce4b5b01ce2cdd50129a03e956ace6c0a4208a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-crispy-bootstrap3 \
python310-crispy-bootstrap3 \
python3dist-crispy-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-crispy-forms"

inherit rpm

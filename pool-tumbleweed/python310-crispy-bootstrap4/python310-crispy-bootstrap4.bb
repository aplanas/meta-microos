SUMMARY = "Bootstrap4 template pack for django-crispy-forms"
DESCRIPTION = "Bootstrap4 template pack for django-crispy-forms"
LICENSE = "MIT"

PV = "2022.1"

RPM_NAME = "python310-crispy-bootstrap4-2022.1-1.1.noarch.rpm"
RPM_HASH = "af77b395ec2c47fbf8600e8a8a22cc14ce13af69243f078a456e7ce6d00b12f6fd6ea0f18ec2c87777231ee8168ef9ab727ba7c0c8d4236e57d22a72696dfec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-crispy-bootstrap4 \
python310-crispy-bootstrap4 \
python3dist-crispy-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-crispy-forms"

inherit rpm

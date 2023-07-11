SUMMARY = "JSON Web Token authentication for Django REST Framework"
DESCRIPTION = "A minimal JSON Web Token authentication plugin for the Django REST Framework."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python39-djangorestframework-simplejwt-4.6.0-1.12.noarch.rpm"
RPM_HASH = "e4ff63037a07c324ac2db8a36f1d87e8129086296481205c51e50962d03736d44c7ceb728aaa7294101cfcf40153d07d06a20a4300c4286a7eca012691546ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-djangorestframework-simplejwt \
python39-djangorestframework-simplejwt \
python3dist-djangorestframework-simplejwt"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-djangorestframework"

inherit rpm

SUMMARY = "Extended session backends for Django"
DESCRIPTION = "Extended session backends for Django."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-django-qsessions-1.1.4-1.3.noarch.rpm"
RPM_HASH = "0991edc6d2a174d914b917a4f7776f212bcc830bbf88044cce81a13f50f47ae8246e54a446f37d469c2e313feadbccaed341c0c3ed6c5f531f9931aa028470b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-qsessions) \
python39-django-qsessions \
python3dist(django-qsessions)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-django-ipware \
python39-user-agents"

inherit rpm

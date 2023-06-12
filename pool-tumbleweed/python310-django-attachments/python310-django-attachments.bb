SUMMARY = "Attach files to any Django model"
DESCRIPTION = "django-attachments is generic Django application to attach Files (Attachments) to any model."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python310-django-attachments-1.11-1.1.noarch.rpm"
RPM_HASH = "301b0c8d35b85e3a9f6c964fc6a2dcc4acc1aad493e24ad592772ed94e2f032c823658da7cac1afc92332053785b3b4005d6ac85a20c316282d6756bc2a6d673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-attachments \
python3.10dist(django-attachments) \
python310-django-attachments \
python3dist(django-attachments)"
RDEPENDS:${PN} += "python(abi) \
python310-django \
python310-six"

inherit rpm

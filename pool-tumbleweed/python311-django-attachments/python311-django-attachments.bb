SUMMARY = "Attach files to any Django model"
DESCRIPTION = "django-attachments is generic Django application to attach Files (Attachments) to any model."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python311-django-attachments-1.11-1.1.noarch.rpm"
RPM_HASH = "e2dcea753a2db6e90f5910e497916344c56045f28f26c7d89ff56d0e4c4f2dc9f9d89e333ca7ba1e15a816708cdd3433a607ec0371dc10122852d0f82a605289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-attachments \
python311-django-attachments \
python3dist-django-attachments"

RDEPENDS:${PN} += "python-abi \
python311-django \
python311-six"

inherit rpm

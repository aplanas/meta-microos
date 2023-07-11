SUMMARY = "Attach files to any Django model"
DESCRIPTION = "django-attachments is generic Django application to attach Files (Attachments) to any model."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python310-django-attachments-1.11-1.3.noarch.rpm"
RPM_HASH = "6967aa22d8b8389f2c0708a7c121619b879e4bcf3bdd981d2bf4f79b7786a33f2880fb1eeaf8b294a965e6f080535267ae16ba8ba809df41ff24cc8e6dc51787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-attachments \
python310-django-attachments \
python3dist-django-attachments"

RDEPENDS:${PN} += "python-abi \
python310-django \
python310-six"

inherit rpm

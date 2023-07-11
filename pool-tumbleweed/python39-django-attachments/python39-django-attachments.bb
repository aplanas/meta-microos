SUMMARY = "Attach files to any Django model"
DESCRIPTION = "django-attachments is generic Django application to attach Files (Attachments) to any model."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python39-django-attachments-1.11-1.3.noarch.rpm"
RPM_HASH = "f23cfb59004fe9bc17fead0fd2728449b35ca2b3d7444881349df0cf97446dad7a4563a0603bc9f1dee83c314448f910dd1423c16f2f6ed6f08734cc66fe0f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-attachments \
python39-django-attachments \
python3dist-django-attachments"

RDEPENDS:${PN} += "python-abi \
python39-django \
python39-six"

inherit rpm

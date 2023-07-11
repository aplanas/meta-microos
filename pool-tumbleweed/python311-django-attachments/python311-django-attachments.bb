SUMMARY = "Attach files to any Django model"
DESCRIPTION = "django-attachments is generic Django application to attach Files (Attachments) to any model."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python311-django-attachments-1.11-1.3.noarch.rpm"
RPM_HASH = "45456db87757b71534274eb37e12a5e42fc26df0a7862986140c7555c8caed4df5f7ed3e33aa990efbdf2ae9d1150e7f08865a187fe3903e32eebe90343f9def"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-attachments \
python3.11dist-django-attachments \
python311-django-attachments \
python3dist-django-attachments"

RDEPENDS:${PN} += "python-abi \
python311-django \
python311-six"

inherit rpm

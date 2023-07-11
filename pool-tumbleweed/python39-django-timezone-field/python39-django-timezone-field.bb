SUMMARY = "Django app providing database and form fields for pytz timezone objects"
DESCRIPTION = "A Django app providing database and form fields for pytz timezone objects."
LICENSE = "BSD-2-Clause"

PV = "5.1"

RPM_NAME = "python39-django-timezone-field-5.1-1.1.noarch.rpm"
RPM_HASH = "65757af09bc7af852ee890db6f0a2c29409d9d5e8e887125cb7bec238f4d31a6209ae89d0157f849c7f3df4c39a7f1ecf69b86803cdfe0a1d593bda3e19c7f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-timezone-field \
python39-django-timezone-field \
python3dist-django-timezone-field"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-pytz"

inherit rpm

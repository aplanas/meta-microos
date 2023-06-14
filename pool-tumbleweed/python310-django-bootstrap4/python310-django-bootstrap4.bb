SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "21.2"

RPM_NAME = "python310-django-bootstrap4-21.2-1.11.noarch.rpm"
RPM_HASH = "80093e3dc5bac7c133f66b341681dbcde052043586fa7640a3d02db61584da33d76208d92407d2c5055d5138a8d74559571e6dd5274d07e9de470784856008b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-bootstrap4 \
python3.10dist-django-bootstrap4 \
python310-django-bootstrap4 \
python3dist-django-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-beautifulsoup4"

inherit rpm

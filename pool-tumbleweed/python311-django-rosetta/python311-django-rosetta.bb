SUMMARY = "Django application that eases the translation of Django projects"
DESCRIPTION = "Django application that eases the translation of Django projects."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python311-django-rosetta-0.9.9-1.3.noarch.rpm"
RPM_HASH = "9be1a2c6f638cb0fbfdceef05f070b8c84ce88ebc1d1f4fe02413293a9a56d4dd7ca78f707986d1d7b4598c2d19ae0d139343c0871c8223d39689bae54cac848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rosetta \
python3.11dist-django-rosetta \
python311-django-rosetta \
python3dist-django-rosetta"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-polib \
python311-requests"

inherit rpm

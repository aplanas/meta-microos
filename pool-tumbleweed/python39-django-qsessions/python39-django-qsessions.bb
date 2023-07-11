SUMMARY = "Extended session backends for Django"
DESCRIPTION = "Extended session backends for Django."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-django-qsessions-1.1.4-1.5.noarch.rpm"
RPM_HASH = "d464799c3fa96dbdb7e71e2a6f518eafb07653e5625d6c7aa2ca691c8e22f8e15a425851c5209fc2b73a8f44d294052149faddb505902f08b1d1fb0f45f47f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-qsessions \
python39-django-qsessions \
python3dist-django-qsessions"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-ipware \
python39-user-agents"

inherit rpm

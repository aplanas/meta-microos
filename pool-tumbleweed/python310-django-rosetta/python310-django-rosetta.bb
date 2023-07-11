SUMMARY = "Django application that eases the translation of Django projects"
DESCRIPTION = "Django application that eases the translation of Django projects."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python310-django-rosetta-0.9.9-1.3.noarch.rpm"
RPM_HASH = "e7fae6d810ba74cea74a74b8540d5c341d89829d2122c30397c503181cd211610495a4c4c743d466607cbc8adfd7f0f7b428671787c2cb67b21463bdae74af5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-rosetta \
python310-django-rosetta \
python3dist-django-rosetta"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-polib \
python310-requests"

inherit rpm

SUMMARY = "Django application that eases the translation of Django projects"
DESCRIPTION = "Django application that eases the translation of Django projects."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python39-django-rosetta-0.9.9-1.3.noarch.rpm"
RPM_HASH = "fa6f0126cee534660514656244b8e9f29dd0c440d83d61e11062367f7b5609b8b149c4179e4d79bfece4c71f5ece384dcdd204305788a3bc79a84fa066c96049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-rosetta \
python39-django-rosetta \
python3dist-django-rosetta"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-polib \
python39-requests"

inherit rpm

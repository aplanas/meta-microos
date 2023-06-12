SUMMARY = "Django application that eases the translation of Django projects"
DESCRIPTION = "Django application that eases the translation of Django projects."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python311-django-rosetta-0.9.9-1.1.noarch.rpm"
RPM_HASH = "ae0ff40ae7186e9295985e7de2730a9369b85ce1146ff479510cfa9433ae072183ef68156e86055a072122ab14a2823b2ec75b5f335c950cc86eb117c2dd1586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-rosetta) \
python311-django-rosetta \
python3dist(django-rosetta)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-polib \
python311-requests"

inherit rpm

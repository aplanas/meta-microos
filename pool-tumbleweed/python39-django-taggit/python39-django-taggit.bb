SUMMARY = "Django-taggit is a reusable Django application for simple tagging"
DESCRIPTION = "Django-taggit is a reusable Django application for simple tagging."
LICENSE = "BSD-3-Clause-Clear"

PV = "4.0.0"

RPM_NAME = "python39-django-taggit-4.0.0-1.3.noarch.rpm"
RPM_HASH = "543068dcafa63e394b9761d81f01817733b4ffae1efbc7f69548bb9b5b7fceccc710a0beae01dab01c5e46f7138042fa808e5d220c400c37706f8ae91941f143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-taggit \
python39-django-taggit \
python3dist-django-taggit"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm

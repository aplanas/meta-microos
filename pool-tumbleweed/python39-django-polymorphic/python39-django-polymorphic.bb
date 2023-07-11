SUMMARY = "Polymorphic inheritance for Django models"
DESCRIPTION = "Seamless polymorphic inheritance for Django models."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python39-django-polymorphic-3.1-2.8.noarch.rpm"
RPM_HASH = "86114b671e6c461a36207ceb5b52d31b3a4c7d3223681fe7e1520243b9c7dc5a788d302bf6eb5a6abf8aeb20110d9ad15d459766670734a723428113743b284f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-polymorphic \
python39-django-polymorphic \
python3dist-django-polymorphic"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm

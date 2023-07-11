SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python311-django-formtools-2.4.1-1.3.noarch.rpm"
RPM_HASH = "6f2753d93a3a7f52fb701945e0025c50cd3081cafef8bfc7092c4020de5988842029023e416bbf27d3a97f16b4f6ea1bef0cb4c340de3701941f1f6341ea784f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-formtools \
python3.11dist-django-formtools \
python311-django-formtools \
python3dist-django-formtools"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm

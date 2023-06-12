SUMMARY = "Fabulous Tagging for Django"
DESCRIPTION = "Fabulous Tagging for Django."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "python39-django-tagulous-1.3.3-1.5.noarch.rpm"
RPM_HASH = "95428ca1887e4a85b53ff32a388877c0afea34619ad36c7de7fc5a4fa834714e859003388d6e95bf1f6d6519b12d5748d33199f11edb991b314de1a0375cb913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-tagulous) \
python39-django-tagulous \
python3dist(django-tagulous)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm

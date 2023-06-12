SUMMARY = "Fabulous Tagging for Django"
DESCRIPTION = "Fabulous Tagging for Django."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "python311-django-tagulous-1.3.3-1.5.noarch.rpm"
RPM_HASH = "bbce518d8b38677ce41e1b1a913955b9588932dd566bafe8a7501a237179f87bd804441a40d286d8996b2f20de6c5e13236a8419802c0105ace7f2704078a0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-tagulous) \
python311-django-tagulous \
python3dist(django-tagulous)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm

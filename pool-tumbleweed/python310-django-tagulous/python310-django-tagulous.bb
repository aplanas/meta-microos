SUMMARY = "Fabulous Tagging for Django"
DESCRIPTION = "Fabulous Tagging for Django."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "python310-django-tagulous-1.3.3-1.5.noarch.rpm"
RPM_HASH = "0e435244ab131150b3e3b73f847c1fa1669f16c4168c6af325a5c8e1570554252d1bef3763baddfa1aa9e4e25f4cc70c728db6c9b5b9caa7fb76844b042863c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tagulous \
python3.10dist(django-tagulous) \
python310-django-tagulous \
python3dist(django-tagulous)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm

SUMMARY = "A skin for the Django Admin-Interface"
DESCRIPTION = "A jazzy skin for the Django Admin-Interface."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "3.0.6"

RPM_NAME = "python39-django-grappelli-3.0.6-1.1.noarch.rpm"
RPM_HASH = "95a094b25f6acca4cc8be86f19e8b847c1ee874acf4d70d3edb8d4fbbc462443bd503efc0a51e2feb28ab9c935035b8c7e2de1627ce8533c8d7c806ff95feb60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-grappelli \
python39-django-grappelli \
python3dist-django-grappelli"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm

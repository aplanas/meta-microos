SUMMARY = "Compatibility library for Django"
DESCRIPTION = "Version checking library for Django."
LICENSE = "GPL-2.0-only | LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "python39-django-nine-0.2.7-1.6.noarch.rpm"
RPM_HASH = "446acfec5a26a3284a379094614105c82059d04aa29398f39fc69c28be527343d77dcdc0908cf9fc4b415f99f92cd51b69b9a942ed55f123135caa4f09dda176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-nine \
python39-django-nine \
python3dist-django-nine"

RDEPENDS:${PN} += "python-abi \
python39-packaging"

inherit rpm

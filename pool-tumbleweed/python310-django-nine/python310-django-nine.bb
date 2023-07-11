SUMMARY = "Compatibility library for Django"
DESCRIPTION = "Version checking library for Django."
LICENSE = "GPL-2.0-only | LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "python310-django-nine-0.2.7-1.6.noarch.rpm"
RPM_HASH = "0f614027f7efe0cac0558b08313aad224ae5401057a8dcfa11cdac494a9ec14c60afa6f907037f8595027e0eca3bdf59ec16fe6a1045a1b9d277034aabd1c9a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-nine \
python310-django-nine \
python3dist-django-nine"

RDEPENDS:${PN} += "python-abi \
python310-packaging"

inherit rpm

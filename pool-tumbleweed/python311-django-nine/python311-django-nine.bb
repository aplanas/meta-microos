SUMMARY = "Compatibility library for Django"
DESCRIPTION = "Version checking library for Django."
LICENSE = "GPL-2.0-only | LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "python311-django-nine-0.2.7-1.4.noarch.rpm"
RPM_HASH = "d9a4cf104c03aa2c3696e9af8ecad641985797c264f28f636adf99194cbcea4ba8f7b5843f678feeb44e7ca142934093b577cb836a19bbe53e9c468096f119fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-nine \
python311-django-nine \
python3dist-django-nine"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm

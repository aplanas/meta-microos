SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python311-django-upgrade-1.13.0-1.4.noarch.rpm"
RPM_HASH = "04f8a30d0dd508df9ceacc808aa8ad25e680d76731f101154935c0c8137daf2dbb6f2e1e2920e702cca43d72881ce541a7d950e762d42d3fc2aec8e7e17d32b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-upgrade \
python3.11dist-django-upgrade \
python311-django-upgrade \
python3dist-django-upgrade"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-tokenize-rt \
update-alternatives"

inherit rpm

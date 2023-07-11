SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python39-django-upgrade-1.13.0-1.4.noarch.rpm"
RPM_HASH = "4d663ed62f6310c19acae54739b586c206774257e469114dc86f1a0256f3cee07c36345f8e48c547af337ab79cc1a4a8540f65f06cbdfcea9e49a05aff0a41ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-upgrade \
python39-django-upgrade \
python3dist-django-upgrade"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-tokenize-rt \
update-alternatives"

inherit rpm

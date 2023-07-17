SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python39-django-upgrade-1.14.0-1.1.noarch.rpm"
RPM_HASH = "e464fc4659fa44fb1f7b8a35047bbdd2c135c4b2dae2291c7f1881159a6ba3a0a3ae8327f5925eac84c048585cd57421498c81de4828ff413064a55b15e44f9b"
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

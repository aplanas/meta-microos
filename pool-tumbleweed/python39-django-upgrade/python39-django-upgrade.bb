SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python39-django-upgrade-1.13.0-1.2.noarch.rpm"
RPM_HASH = "d72ba4f5af8b5ba6389dde06625326ffe08087429b4a86d2e515f4fb2a8d3011514e407a5c0decda797480046abbb43808b2f741efd5ac5f4f60630ce5733d03"
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

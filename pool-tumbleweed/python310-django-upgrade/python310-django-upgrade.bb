SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python310-django-upgrade-1.14.0-1.1.noarch.rpm"
RPM_HASH = "a7914b32770dad4d8aac474b9540193fc623b42b2482d12aceeb156a0cfc7daf2d5d5ab5e2760878171def742e2c0aa7f53d21efbdbdab10d44f991dfbf81ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-upgrade \
python310-django-upgrade \
python3dist-django-upgrade"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-tokenize-rt \
update-alternatives"

inherit rpm

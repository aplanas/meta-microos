SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python311-django-upgrade-1.14.0-1.1.noarch.rpm"
RPM_HASH = "206d151d564dcad81e05a19e8342bb4c7d31ee3774b5dac35bd71852a324db47445f45ec1125488f364e21c213649037c9298ea2353e4ae66108afc26afe9b9c"
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

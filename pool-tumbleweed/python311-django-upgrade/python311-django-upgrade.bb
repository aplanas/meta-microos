SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python311-django-upgrade-1.13.0-1.2.noarch.rpm"
RPM_HASH = "16827f2e260050831d5b9521bd1a59320783ef85df5a599c82cbe1d425147680cf181330aea41e6f8567d5c3fc85ca3acacfc3ceca11424a04a735773c9afcc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-upgrade) \
python311-django-upgrade \
python3dist(django-upgrade)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-tokenize-rt \
update-alternatives"

inherit rpm

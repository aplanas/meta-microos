SUMMARY = "Compatibility library for Django"
DESCRIPTION = "Version checking library for Django."
LICENSE = "GPL-2.0-only | LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "python311-django-nine-0.2.7-1.6.noarch.rpm"
RPM_HASH = "a5c7dc5016f0c0c1b8dcdf65442a0c79b05a9057d327327be7c9196339320506113c3b79222b0fd5e8459f9696993b09a69ad48dfc7b2361da0e426c8fdabbfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-nine \
python3.11dist-django-nine \
python311-django-nine \
python3dist-django-nine"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm

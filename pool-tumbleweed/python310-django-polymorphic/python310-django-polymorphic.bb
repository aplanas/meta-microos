SUMMARY = "Polymorphic inheritance for Django models"
DESCRIPTION = "Seamless polymorphic inheritance for Django models."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python310-django-polymorphic-3.1-2.8.noarch.rpm"
RPM_HASH = "7a4849707e251f6ecb8d12158e87124db863b0833aa65312a3ceeaa6b3a9af9043992bd812a643998ac8775c859f0a3201dda28821b81a33de906163f7c6abe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-polymorphic \
python310-django-polymorphic \
python3dist-django-polymorphic"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
